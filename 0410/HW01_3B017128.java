// 3B017128 陳右承 作業一 0410
// 作業倉庫
// https://github.com/AmanoShizukikun/NCUT-1142-Java
// 個人網站
// https://amanoshizukikun.github.io/

class GameBase0410 {
	int id;
	String name;
	int achievements;

	static {
		System.out.println("static 載入父類別 GameBase0410");
	}

	// 建構子多載 1：不帶參數
	GameBase0410() {
		this(0, "未命名遊戲", 0);
	}

	// 建構子多載 2：帶入編號與名稱
	GameBase0410(int id, String name) {
		this(id, name, 0);
	}

	// 建構子多載 3：完整帶入
	GameBase0410(int id, String name, int achievements) {
		this.id = id;
		this.name = name;
		this.achievements = achievements;
	}

	// 方法多載 1：只印基本資料
	void showInfo() {
		System.out.println("編號：" + this.id);
		System.out.println("遊戲名稱：" + this.name);
	}

	// 方法多載 2：可選擇是否印出成就數
	void showInfo(boolean showAchievements) {
		showInfo();
		if (showAchievements) {
			System.out.println("成就數：" + this.achievements);
		}
	}

	// 方法多載 3：可加上標題
	void showInfo(String title) {
		System.out.println(title);
		showInfo(true);
	}
}

class OnlineGame0410 extends GameBase0410 {
	//子類別：繼承父類別後，多一個 server 屬性。
	String server;

	static {
		System.out.println("static 載入子類別 OnlineGame0410");
	}

	// 建構子多載 1：不帶參數
	OnlineGame0410() {
		this(1, "預設線上遊戲", 10, "Asia-TW");
	}

	// 建構子多載 2：帶入編號與名稱
	OnlineGame0410(int id, String name) {
		this(id, name, 0, "未指定");
	}

	// 建構子多載 3：完整帶入，並呼叫 super
	OnlineGame0410(int id, String name, int achievements, String server) {
		super(id, name, achievements);
		this.server = server;
	}

	// override：改寫父類別 showInfo()
	@Override
	void showInfo() {
		System.out.println("編號：" + this.id);
		System.out.println("遊戲名稱：" + this.name);
		System.out.println("伺服器：" + this.server);
	}

	// overload：多一個參數，印出在線人數
	void showInfo(int onlinePlayers) {
		showInfo();
		System.out.println("目前在線人數：" + onlinePlayers);
	}

	// overload：兩個參數，印出標題 + 詳細資訊
	void showInfo(String title, int onlinePlayers) {
		System.out.println(title);
		showInfo(onlinePlayers);
		System.out.println("成就數：" + this.achievements);
	}
}

public class HW01_3B017128 {
	public static void main(String[] args) {
		System.out.println("=== 父類別物件、繼承與多載方法 ===");
		GameBase0410 g1 = new GameBase0410(1001, "Terraria", 88);
		g1.showInfo();
		System.out.println("-------------------");
		g1.showInfo(true);
		System.out.println("-------------------");
		g1.showInfo("父類別 showInfo(String) 輸出");
		System.out.println("\n=== 子類別物件、繼承與多載方法 ===");
		OnlineGame0410 g2 = new OnlineGame0410(2001, "Apex", 120, "Asia-1");
		g2.showInfo();
		System.out.println("-------------------");
		g2.showInfo(56);
		System.out.println("-------------------");
		g2.showInfo("子類別 showInfo(String, int) 輸出", 56);
		System.out.println("\n=== 父類別參考指向子類別物件 ===");
		GameBase0410 g3 = new OnlineGame0410(2002, "Valorant", 77, "JP-1");
		g3.showInfo();
		System.out.println("-------------------");
		g3.showInfo(true);
	}
}

