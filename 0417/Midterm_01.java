// 3B017128 陳右承 作業一 0417
// 作業倉庫
// https://github.com/AmanoShizukikun/NCUT-1142-Java
// 個人網站
// https://amanoshizukikun.github.io/

import java.util.*;

class Mid_01 {
    int Mid_01 = 5;
    static { SOP(5);}
    Mid_01() {SOP(3); this.Mid_01(2);}
    Mid_01(int Mid_01) {this();
        SOP(4);
        this.Mid_01(5, 5);
    }

    Mid_01(int... Mid_01) {this(1);
        SOP(0);
    }

    void Mid_01() {
        SOP(9);
    }

    void Mid_01(int Mid_01) {Mid_01();
        SOP(2);
    }

    void Mid_01(int... Mid_01) {
        SOP(5);
    }

    static void SOP(Object obj) {
        System.out.print(obj);
    }
}

public class Midterm_01 {
    public static void main(String[] args) {
        new Mid_01();
        new Mid_01(9, 9, 9, 9);
    }
}