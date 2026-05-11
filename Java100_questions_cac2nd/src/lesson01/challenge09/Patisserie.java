/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

public class Patisserie {
	public static void main(String[] args) {

		System.out.println("隊長：");
		System.out.println("間欠泉が10個あるよ気をつけて！\n");

		int geyser = 0;
		int damage = 0;
		for (int i = 0; i < 10; i++) {

			geyser = (int) (Math.random() * 10 % 2);

			//ここにif文、continue文を利用した処理を記述

			damage++;
			System.out.println("隊長：");
			System.out.println((i + 1) + "個目。熱湯");
			System.out.println("うわ熱っ！（ダメージ" + damage + "）\n");

			if (damage == 6) {
				break;
			}
		}
		if (damage != 6) {
			System.out.println("洞窟の出口にたどり着きました。");
		} else {
			System.out.println("探検隊は全滅しました。");
		}
	}

}
