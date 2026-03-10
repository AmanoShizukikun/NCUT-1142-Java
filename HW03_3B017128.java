// 3B017128 陳右承 作業三
// 作業倉庫
// https://github.com/AmanoShizukikun/NCUT-1142-Java
// 個人網站
// https://amanoshizukikun.github.io/

import java.util.*;

class GameInfoHW03 {                                                            
    String name;                                                            
    int achievements;                                                       
    double playHours;                                                       
    int id;                                                                 
    
    private int friendsCount;       // 好友數
    private int reviews;            // 評論數
    private String releaseDate;     // 發行日期

    // 多載方法一傳入三個參數 (好友數、評論數、發行日期)
    public void setExtraInfo(int f, int r, String d) {
        this.friendsCount = f;
        this.reviews = r;
        this.releaseDate = d;
    }

    // 多載方法二僅傳入兩個參數 (好友數、評論數)，發行日期自動帶入
    public void setExtraInfo(int f, int r) {
        this.friendsCount = f;
        this.reviews = r;
        this.releaseDate = "未提供";
    }

    // 建立公開方法 (getter) 取值
    public int getFriendsCount() {                                                    
        return friendsCount;
    }
    public int getReviews() {
        return reviews;
    }
    public String getReleaseDate() {
        return releaseDate;
    }
}

public class HW03_3B017128 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in, "UTF-8")) {       //前面同作業二
            System.out.print("請輸入遊戲數量：");                             
            int n = scanner.nextInt();                                         
            scanner.nextLine();
            GameInfoHW03[] games = new GameInfoHW03[n];
            for (int i = 0; i < n; i++) {                                      
                System.out.println("------ 第 " + (i + 1) + " 個遊戲 ------");
                games[i] = new GameInfoHW03();
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
                int f = scanner.nextInt();
                System.out.print("評論數：");
                int r = scanner.nextInt();
                scanner.nextLine();
                System.out.print("發行日期：");
                String d = scanner.nextLine();
                if (d.isEmpty()) {
                    games[i].setExtraInfo(f, r);
                } else {
                    games[i].setExtraInfo(f, r, d);
                }
            }

            System.out.println("\n輸入完畢，以下為遊戲清單：");                       
            for (GameInfoHW03 g : games) {                                                 
                System.out.println("-------------------");
                System.out.println("編號：" + g.id);
                System.out.println("遊戲名稱：" + g.name);
                System.out.println("成就數：" + g.achievements);
                System.out.println("累積遊玩時數：" + g.playHours + " 小時");
                System.out.println("好友數：" + g.getFriendsCount());                  
                System.out.println("評論數：" + g.getReviews());                       
                System.out.println("發行日期：" + g.getReleaseDate());                 
            }
        }
    }
}