// 3B017128 陳右承 作業二 0313
// 作業倉庫
// https://github.com/AmanoShizukikun/NCUT-1142-Java
// 個人網站
// https://amanoshizukikun.github.io/

import java.util.*;

class GameInfo0313HW02 {
    // 私有屬性
    private int id;
    private String name;
    private int achievements;
    private double playHours;
    private double totalScore;

    // 建構子參數與成員變數同名，用 this. 區分
    public GameInfo0313HW02(int id, String name, int achievements, double playHours) {
        this.id = id;
        this.name = name;
        this.achievements = achievements;
        this.playHours = playHours;
    }

    // setter：執行運算並傳值，計算總分（成就數 * 累積遊玩時數）
    public void setTotalScore() {
        this.totalScore = this.achievements * this.playHours;
    }

    // 列印所有資訊
    public void printInfo(int index) {
        System.out.println("-------------------");
        System.out.println("編號：" + this.id);
        System.out.println("名稱：" + this.name);
        System.out.println("成就數：" + this.achievements);
        System.out.println("累積遊玩時數：" + this.playHours + " 小時");
        System.out.println("計算結果（總分）：" + this.totalScore);
    }
}

public class HW02_3B017128 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in, "UTF-8")) {
            System.out.print("請輸入遊戲數量：");
            int n = scanner.nextInt();
            scanner.nextLine();
            GameInfo0313HW02[] GameInfo0313HW02s = new GameInfo0313HW02[n];

            // 用建構子建立物件，並用 setter 執行運算
            for (int i = 0; i < n; i++) {
                System.out.println("請輸入第 " + (i + 1) + " 個遊戲的編號、名稱、成就數、累積遊玩時數：(以空格分隔)");
                int id = scanner.nextInt();
                String name = scanner.next();
                int achievements = scanner.nextInt();
                double playHours = scanner.nextDouble();
                scanner.nextLine();
                GameInfo0313HW02s[i] = new GameInfo0313HW02(id, name, achievements, playHours);
                GameInfo0313HW02s[i].setTotalScore();
            }

            // 呼叫類別方法列印所有資訊
            System.out.println("\n輸入結果如下：");
            for (int i = 0; i < n; i++) {
                GameInfo0313HW02s[i].printInfo(i);
            }
        }
    }
}
