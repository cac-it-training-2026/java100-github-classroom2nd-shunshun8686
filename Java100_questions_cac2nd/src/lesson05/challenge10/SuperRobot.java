package lesson05.challenge10;

class SuperRobot {
	public String makeSpecialDish(int meat, int vegetable, int wine) {
		String dish = null;
		if (meat >= 500 && vegetable >= 300 && wine >= 100) {
			dish = "特製A5ランク牛の赤ワイン煮込み";
		} else if (meat >= 200 && vegetable >= 100) {
			dish = "豪華なハンバーグステーキ";
		} else {
			dish = "超高級サラダ";
		}
		return dish;
	}

	public static void main(String[] args) {

		SuperRobot robot = new SuperRobot();

		String menu = robot.makeSpecialDish(600, 400, 200);

		System.out.println("Rさん：独自開発したロボットを動かします！");
		System.out.println("G博士：ほう、どれどれ……");
		System.out.println("\n" + menu + " が出来ました！");
	}
}