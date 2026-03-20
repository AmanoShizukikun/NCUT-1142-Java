// 3B017128 陳右承 作業一 0320
// 作業倉庫
// https://github.com/AmanoShizukikun/NCUT-1142-Java
// 個人網站
// https://amanoshizukikun.github.io/

class AA {
    static { System.out.print("0"); }
    private int n = 0;
    AA() { System.out.print("1"); }
    AA(int n) { System.out.print("2"); }
    AA(int... n) { System.out.print("4"); }
    void AA() { System.out.print("6"); }
    void AA(int n) { System.out.print("5"); }
    void AA(int... n) { System.out.print("3"); }
}


public class HW01_3B017128 {
    public static void main(String[] args) {
        AA b = new AA();        // static 一開始輸出 0 + new AA()輸出 1
        new AA(1);           // 2
        b.AA(1, 2, 3);    // 3
        new AA(1, 2);     // 4
        b.AA(1);             // 5
        b.AA();                 // 6
    }
    static void SOP(Object o) { System.out.print(o); }
}
