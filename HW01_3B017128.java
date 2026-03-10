// 3B017128 陳右承 作業一
// 作業倉庫
// https://github.com/AmanoShizukikun/NCUT-1142-Java
// 個人網站
// https://amanoshizukikun.github.io/

import java.util.*; // 用於讀取使用者輸入

class GameInfoHW01 {                                                          // 定義類別
    String name;                                                              // 定義屬性字串遊戲名稱
    int achievements;                                                         // 定義屬性整數成就數
    double playHours;                                                         // 定義屬性浮點數遊玩時數
    int id;                                                                   // 定義屬性整數編號
}


public class HW01_3B017128 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in, "UTF-8")) {
            System.out.print("請輸入遊戲數量：");                             // 要求使用者輸入遊戲數量
            int n = scanner.nextInt();                                         // 讀取使用者輸入的整數
            scanner.nextLine();                                                // 吸收換行符號
            GameInfoHW01[] games = new GameInfoHW01[n];                        // 建立Game類別的陣列以儲存遊戲資料
            for (int i = 0; i < n; i++) {                                      // 迴圈讀取每個遊戲的資料
                System.out.println("------ 第 " + (i + 1) + " 個遊戲 ------");
                games[i] = new GameInfoHW01();
                System.out.print("編號：");
                games[i].id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("名稱：");
                games[i].name = scanner.nextLine();
                System.out.print("成就數：");
                games[i].achievements = scanner.nextInt();
                System.out.print("累積遊玩時數：");
                games[i].playHours = scanner.nextDouble();
                scanner.nextLine();
            }

            System.out.println("\n輸入完畢，以下為遊戲清單：");                 // 印出遊戲清單
            for (GameInfoHW01 g : games) {                                      // 迴圈印出每個遊戲的資料
                System.out.println("-------------------");
                System.out.println("編號：" + g.id);
                System.out.println("遊戲名稱：" + g.name);
                System.out.println("成就數：" + g.achievements);
                System.out.println("累積遊玩時數：" + g.playHours + " 小時");
            }
        }
    }
}
