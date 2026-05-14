// 3B017128 陳右承 作業一 0508
// 作業倉庫
// https://github.com/AmanoShizukikun/NCUT-1142-Java
// 個人網站
// https://amanoshizukikun.github.io/

class A {
    int a = 1; 
    void A(int n) {
        System.out.println("【平台 A】下載遊戲，遊戲編號：" + n);
    }
    
    void A(int... n) {
        System.out.print("【平台 A】批量下載遊戲，編號包含：");
        for (int i : n) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class B extends A {
    int a = 2;
    
    void A() {
        System.out.println("【平台 B】開啟遊戲庫首頁，瀏覽推薦遊戲。");
    }
    
    void A(int n) {
        System.out.println("【平台 B】啟動遊戲並連線至雲端存檔，遊戲編號：" + n);
    }
    
    void A(int m, int n, int o) {
        System.out.println("【平台 B】將三款遊戲加入購物車，編號：" + m + ", " + n + ", " + o);
    }
}

class C extends B {
    int a = 3;
    
    void A() {
        System.out.println("【平台 C】自動領取本週免費遊戲並更新所有庫存。");
    }
    
    void A(int... n) {
        System.out.print("【平台 C】將多款遊戲加入最愛收藏，編號：");
        for (int i : n) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class HW01_3B017128 {
    public static void main(String[] args) {
        System.out.println("========== 測試 A ==========");
        A objA = new A();
        objA.A(101); // 呼叫 A(int n)
        objA.A(101, 102, 103, 104); // 呼叫 A(int... n)
        
        System.out.println("\n========== 測試 B ==========");
        B objB = new B();
        objB.A(); // 呼叫 B 自己新增的 A()
        objB.A(201); // 呼叫 B 覆寫的 A(int n)
        objB.A(201, 202, 203); // 呼叫 B 的 A(int m, int n, int o)
        objB.A(204, 205); // 呼叫從 A 繼承來的 A(int... n)
        
        System.out.println("\n========== 測試 C ==========");
        C objC = new C();
        objC.A(); // 呼叫 C 覆寫的 A()
        objC.A(301); // 呼叫從 B 繼承來的 A(int n)
        objC.A(301, 302, 303); // 呼叫從 B 繼承來的 A(int m, int n, int o)
        objC.A(304, 305); // 呼叫 C 覆寫的 A(int... n)
        objC.A(306, 307, 308, 309); // 呼叫 C 覆寫的 A(int... n)
    }
}