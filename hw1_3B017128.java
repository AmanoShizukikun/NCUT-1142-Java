// 3B017128 陳右承 作業一
// 作業倉庫
// https://github.com/AmanoShizukikun/NCUT-1142-Java
// 個人網站
// https://amanoshizukikun.github.io/

class Game {                                                                // 定義類別
    String name;                                                            // 定義屬性字串遊戲名稱
    int achievements;                                                       // 定義屬性整數成就數
    double playHours;                                                       // 定義屬性浮點數遊玩時數
}


public class hw1_3B017128 {
    public static void main(String[] args) {
        Game game1 = new Game();                                            // 建立第一個遊戲物件game1
        game1.name = "SenrenBanka";                                         // 呼叫遊戲一屬性，並寫入名稱
        game1.achievements = 1;                                             // 呼叫遊戲一屬性，並寫入成就數
        game1.playHours = 26.4;                                             // 呼叫遊戲一屬性，並寫入遊玩時數
        System.out.println("遊戲名稱：" + game1.name);                       // 讀取遊戲一名稱屬性並印出結果
        System.out.println("成就數：" + game1.achievements);                 // 讀取遊戲一成就數屬性並印出結果
        System.out.println("累積遊玩時數：" + game1.playHours + " 小時");     // 讀取遊戲一名稱屬性並印出結果
        System.out.println("-------------------");                        // 分隔線
        Game game2 = new Game();                                            // 建立第二個遊戲物件game2
        game2.name = "sanoba witch";                                        // 呼叫遊戲二屬性，並寫入名稱
        game2.achievements = 27;                                            // 呼叫遊戲二屬性，並寫入成就數
        game2.playHours = 24.7;                                             // 呼叫遊戲二屬性，並寫入遊玩時數
        System.out.println("遊戲名稱：" + game2.name);                       // 讀取遊戲二名稱屬性並印出結果
        System.out.println("成就數：" + game2.achievements);                 // 讀取遊戲二成就數屬性並印出結果
        System.out.println("累積遊玩時數：" + game2.playHours + " 小時");     // 讀取遊戲二名稱屬性並印出結果
        
    }
}
