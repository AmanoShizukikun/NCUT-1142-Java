// 3B017128 陳右承 作業一 0313
// 作業倉庫
// https://github.com/AmanoShizukikun/NCUT-1142-Java
// 個人網站
// https://amanoshizukikun.github.io/

import java.util.*;

class GameInfo0313HW01 {
    // 私有屬性
    private int id;
    private String name;
    private int achievements;
    private double playHours;

    // 建構子參數與成員變數同名，用 this. 區分
    public GameInfo0313HW01(int id, String name, int achievements, double playHours) {
        this.id = id;
        this.name = name;
        this.achievements = achievements;
        this.playHours = playHours;
    }

    // setter 方法：讓主程式可以透過方法設定私有屬性
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAchievements(int achievements) {
        this.achievements = achievements;
    }
    public void setPlayHours(double playHours) {
        this.playHours = playHours;
    }

    // getter 方法：讓主程式透過方法取得私有屬性值
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAchievements() {
        return achievements;
    }
    public double getPlayHours() {
        return playHours;
    }
}

public class HW01_3B017128 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in, "UTF-8")) {
            System.out.print("請輸入遊戲數量：");
            int n = scanner.nextInt();
            scanner.nextLine();
            GameInfo0313HW01[] games = new GameInfo0313HW01[n];
            for (int i = 0; i < n; i++) {
                System.out.println("請輸入第 " + (i + 1) + " 個遊戲的編號、名稱、成就數、累積遊玩時數：(以空格分隔)");
                games[i] = new GameInfo0313HW01(0, "", 0, 0.0);
                // 讀取輸入並設定屬性值
                int id = scanner.nextInt();
                String name = scanner.next();
                int achievements = scanner.nextInt();
                double playHours = scanner.nextDouble();
                scanner.nextLine();
                games[i].setId(id);
                games[i].setName(name);
                games[i].setAchievements(achievements);
                games[i].setPlayHours(playHours);
            }

            // 列印輸入結果
            System.out.println("\n輸入結果如下：");
            for (GameInfo0313HW01 g : games) {
                System.out.println("-------------------");
                System.out.println("編號：" + g.getId());
                System.out.println("遊戲名稱：" + g.getName());
                System.out.println("成就數：" + g.getAchievements());
                System.out.println("累積遊玩時數：" + g.getPlayHours() + " 小時");
            }
        }
    }
}
