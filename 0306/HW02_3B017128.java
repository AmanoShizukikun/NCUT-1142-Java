// 3B017128 陳右承 作業二 0306
// 作業倉庫
// https://github.com/AmanoShizukikun/NCUT-1142-Java
// 個人網站
// https://amanoshizukikun.github.io/

import java.util.*;

class GameInfoHW02 {                                                            
    String name;                                                            
    int achievements;                                                       
    double playHours;                                                       
    int id;                                                                 
    private int friendsCount;                                                         // 好友數
    private int reviews;                                                              // 評論數
    private String releaseDate;                                                       // 發行日期
    public void setFriendsCount(int f) {                                              // 建立公開方法 (setter)，讓主程式能夠透過該方法去給私有屬性賦值
        friendsCount = f;
    }
    public void setReviews(int r) {
        reviews = r;
    }
    public void setReleaseDate(String d) {
        releaseDate = d;
    }
    public int getFriendsCount() {                                                    // 建立公開方法 (getter)，讓主程式能夠透過該方法去取私有屬性
        return friendsCount;
    }
    public int getReviews() {
        return reviews;
    }
    public String getReleaseDate() {
        return releaseDate;
    }
}

public class HW02_3B017128 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in, "UTF-8")) {        //前面同作業一
            System.out.print("請輸入遊戲數量：");                             
            int n = scanner.nextInt();                                         
            scanner.nextLine();
            GameInfoHW02[] games = new GameInfoHW02[n];
            for (int i = 0; i < n; i++) {                                      
                System.out.println("------ 第 " + (i + 1) + " 個遊戲 ------");
                games[i] = new GameInfoHW02();
                System.out.print("編號：");
                games[i].id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("名稱：");
                games[i].name = scanner.nextLine();
                System.out.print("成就數：");
                games[i].achievements = scanner.nextInt();
                System.out.print("累積遊玩時數：");
                games[i].playHours = scanner.nextDouble();
                System.out.print("好友數：");
                games[i].setFriendsCount(scanner.nextInt());                          // 透過 setter 賦值
                System.out.print("評論數：");
                games[i].setReviews(scanner.nextInt());                               // 透過 setter 賦值
                scanner.nextLine();
                System.out.print("發行日期：");
                games[i].setReleaseDate(scanner.nextLine());                          // 透過 setter 賦值
            }

            System.out.println("\n輸入完畢，以下為遊戲清單：");                       //同作業一迴圈輸出遊戲資訊     
            for (GameInfoHW02 g : games) {                                                 
                System.out.println("-------------------");
                System.out.println("編號：" + g.id);
                System.out.println("遊戲名稱：" + g.name);
                System.out.println("成就數：" + g.achievements);
                System.out.println("累積遊玩時數：" + g.playHours + " 小時");
                System.out.println("好友數：" + g.getFriendsCount());                  // 透過 getter 取值
                System.out.println("評論數：" + g.getReviews());                       // 透過 getter 取值
                System.out.println("發行日期：" + g.getReleaseDate());                 // 透過 getter 取值
            }
        }
    }
}