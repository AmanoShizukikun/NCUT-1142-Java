// 3B017128 陳右承 作業二 0320
// 作業倉庫
// https://github.com/AmanoShizukikun/NCUT-1142-Java
// 個人網站
// https://amanoshizukikun.github.io/

class HW02 {
    int HW02 = 0;
    // 靜態方法輸出1
    static void printone() {
        System.out.print(1);
    }
    HW02(){
        //輸出1
        printone();
        //輸出2
        System.out.print(2);
        //用this()來呼叫HW02方法,引數帶入4
        this.HW02(4);
    }
    HW02(int HW02){
        //用this()來呼叫HW02方法,不帶入引數。
        this();
        //輸出欄位與引數相加所得值
        System.out.print(this.HW02 + HW02);
        //用this.來呼叫HW02變數,數字帶入1,6使其變成陣列
        this.HW02 = new int[]{1,6}[HW02/4];
    }
    HW02(int... HW02){
        //用this()傳入，引數為5
        this(5);
        //輸出整數陣列中的第二個元素。
        this.HW02(HW02);
        //輸出整數陣列中的第三個元素。
        System.out.print(HW02[2]);
    }
    void HW02(){
        //輸出3
        System.out.print(3);
    }
    void HW02(int HW02){
        //呼叫HW02()方法
        this.HW02();
        //輸出引數HW02的值
        System.out.print(HW02);
    }
    void HW02(int... HW02){
        //輸出整數陣列中的第二個元素。
        System.out.print(HW02[1]);
    }}


public class HW02_3B017128 {
    public static void main(String[] args) {
        new HW02(5,6,7);
    }
}
