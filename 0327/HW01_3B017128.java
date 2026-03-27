// 3B017128 陳右承 作業一 0327
// 作業倉庫
// https://github.com/AmanoShizukikun/NCUT-1142-Java
// 個人網站
// https://amanoshizukikun.github.io/

class dice {
    /*
    建立類別 dice,並宣告全域變數
    宣告一個整數陣列 diceArray,用於輸出跟計算
    個別骰子的值或總值。
    宣告三個整數變數,用於骰子的數量 diceNum(預
    設為1)、最大值dicePoint(預設為6)、及骰子的加
    總值sumOfDices 。
    */
    int[] diceArray;
    int diceNum = 1;
    int dicePoint = 6;
    int sumOfDices;

    static{
        System.out.println("-------------------");
        System.out.println("Dice application...");
        System.out.println("-------------------");
    }
    dice() {
        //利用this()來預設建立7顆6面骰子的物件。
        this(6, 7);
    }
    dice(int dicePoint) {
        //利用this.來設定骰子的點數上限(例如 6面骰),但沒有建立骰子的數量。
        this.dicePoint = dicePoint;
    }
    dice(int dicePoint, int diceNum) {
        /*
        用this()設定骰子點數上限,數量用 this.
        建立陣列來儲存每顆骰子的點數
        利用for迴圈來產生每顆骰子, 隨機點數透過其他建構
        子生成。
        呼叫 dice() 方法來印出內容與總和
        */
        this(dicePoint);
        this.diceNum = diceNum;
        this.diceArray = new int[diceNum];

        for (int i = 0; i < this.diceNum; i++) {
            this.diceArray[i] = dice(this.dicePoint);
        }
        dice();
    }
    int dice(int dicePoint) {
        //產生 1 到 dicePoint 間的亂數
        return (int) (Math.random() * dicePoint) + 1;
    }
    int dice(int[] diceArray) {
        /*
        宣告一個整數變數 sum。
        透過 for 迴圈來計算所有骰子的總和給 sum並回傳sum。 
        */
        int sum = 0;
        for (int point : diceArray) {
            sum += point;
        }
        return sum;
    }
    void dice() {
        /*  
        使用陣列排序法,使得陣列由小到大從左到右排序。
        呼叫showContent()方法。
        把dice(diceArray)傳回的總和值,指定給成員變數
        sumOfDices。
        呼叫showSum()方法。
        */
        for (int i = 0; i < diceArray.length - 1; i++) {
            for (int j = 0; j < diceArray.length - 1 - i; j++) {
                if (diceArray[j] > diceArray[j + 1]) {
                    int temp = diceArray[j];
                    diceArray[j] = diceArray[j + 1];
                    diceArray[j + 1] = temp;
                }
            }
        }

        showContent();
        sumOfDices = dice(diceArray);
        showSum();
    }
    void showSum(){
        /*
        宣告一個整數變數check,取得checkSum的值。
        輸出sumOfDices的值,有重複數就扣掉數check*2。
        */
        int check = checkSum(diceArray);
        System.out.println("Sum of total dices = " + (sumOfDices - check * 2));
        System.out.println("-------------------");
    }
    void showContent() {
        //用 for-each 迴圈來印出每顆骰子的點數。
        for (int point : diceArray) {
            System.out.print(point + " ");
        }
        System.out.println();
        System.out.println("-------------------");
    }
    int checkSum(int [] diceArray) {
        /*
        用 for 迴圈來尋重複點數。
        如果第一個點數有重複就回傳。
        沒有重複就回傳 0 。
        */
        for (int i = 0; i < diceArray.length; i++) {
            for (int j = i + 1; j < diceArray.length; j++) {
                if (diceArray[i] == diceArray[j]) {
                    return diceArray[i];
                }
            }
        }
        return 0;
    }
}

public class HW01_3B017128 {
    public static void main(String[] args) {
        new dice(6,5);
        new dice();
    }
    
}
