// 3B017128 陳右承 作業二
// 作業倉庫
// https://github.com/AmanoShizukikun/NCUT-1142-Java
// 個人網站
// https://amanoshizukikun.github.io/

class hw2data {                                                                  // 定義類別
    String name = "未定義";                                                      // 定義字串屬性遊戲名稱，並給予初始值"未定義"
    private int price;                                                          // 定義屬性整數價格 (私有化，外部無法直接存取)
    public void setprice(int n) {price = n;}                                    // 定義方法，傳入一個整數參數，將其設定為價格
    public void setprice() {price = 1990;}                                      // 定義 Overload 的方法，不傳入任何參數 (0 個)，將價格設定為預設值 1990
    public void setprice(int m, int n) {price = m - n;}                         // 定義 Overload 的方法，傳入兩個整數參數，將兩數相減當作價格
    public void setprice(int m, String n) {price = m; name = n;}                // 定義 Overload 的方法，傳入一個整數與一個字串，同時設定價格與遊戲名稱
    public int getprice() {return price;}                                       // 定義方法，回傳價格，提供外部存取價格的方式
}


public class hw2_3B017128 {
    public static void main(String[] args){
        hw2data game = new hw2data();                                           // 建立遊戲物件
        System.out.println("初始遊戲名稱：" + game.name);                        // 此時遊戲名稱為"未定義"
        game.setprice(3490);                                                 // 呼叫 setprice(int n)，傳入一個整數參數，將其設定為價格
        System.out.println("單一整數設定價格：" + game.getprice());              // 呼叫 getprice() 方法，取得目前價格並印出結果
        game.setprice();                                                       // 呼叫 setprice() 方法，不傳入任何參數，將價格設定為預設值 1990
        System.out.println("無參數設定預設價格：" + game.getprice());            // 呼叫 getprice() 方法，取得目前價格並印出結果(1990)
        game.setprice(3490, 2890);                                        // 呼叫 setprice(int m, int n) 方法，傳入兩個整數參數，將兩數相減當作價格
        System.out.println("兩數相減設定價格：" + game.getprice());              // 呼叫 getprice() 方法，取得目前價格並印出結果(3490-2890=600)
        game.setprice(188, "NEKOPARA After");                             // 呼叫 setprice(int m, String n) 方法，傳入一個整數與一個字串，同時設定價格與遊戲名稱
        System.out.println("同時設定遊戲名稱與價格 - 遊戲名稱：" + game.name + "，價格：" + game.getprice());   // 呼叫 getprice() 方法，取得目前價格並印出結果(188)
    
    }
}