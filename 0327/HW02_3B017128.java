// 3B017128 陳右承 作業二 0327
// 作業倉庫
// https://github.com/AmanoShizukikun/NCUT-1142-Java
// 個人網站
// https://amanoshizukikun.github.io/

class AA{
    static{
        System.out.print("0");
    }
    AA(){
        a = 5;
        b = 5;
        System.out.print("1");
    }
    AA(int a){
        this.a = a;
        System.out.print(this.a);
    }
    AA(int...a ){
        this(2);
        System.out.print("3");
    }
    int a = 0;
    private int b = 0;
    void AA(){
        this.a=a;
        System.out.print("5");
    }
    void AA(int a){
        this.a = a;
        System.out.print("6");
    }
    void AA(int...a ){
        this.a = a[0];
        System.out.print("7");
    }
}

class BB extends AA{
    static{
        System.out.print("A");
    }
    BB(){
        super(10,10);
        System.out.print("B");
    }
    BB(int a){
        this();
        this.a=a;
        System.out.print(this.a);
    }
}

public class HW02_3B017128 {
        public static void main(String[] args) {
            AA d = new AA();                //1.輸出0 → 2.輸出1
            new AA(10);                  //3.輸出10
            new AA(10,10);            //4.輸出2 → 5.輸出3
            new AA();                       //6.輸出1 
            System.out.println();
            BB bb1 = new BB();              //1.輸出A → 2.輸出2(super10,10指向AA(int a)) → 3.輸出3 → 4.輸出B
            BB bb2 = new BB(40);         //5.輸出2(BB(int a){this()}指向BB()) → 6.輸出3 → 7.輸出B → 8.輸出40
            }
}
