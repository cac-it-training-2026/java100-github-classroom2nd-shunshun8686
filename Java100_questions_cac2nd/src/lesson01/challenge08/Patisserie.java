/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
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
 */

package lesson01.challenge08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("\n本日のおすすめ商品です。\n");
		//		エスケープシーケンスで改行
		int pig1 = 30;
		int pig2 = 30;
		int pig3 = 30;
		//型名　識別子イコールで代入
		System.out.println("シトロン\\250残り…" + pig1 + "個");
		System.out.println("ショコラ\\280…残り" + pig2 + "個");
		System.out.println("ピスターシュ\\320…残り" + pig3 + "個");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");
		System.out.println("シトロン　　　　>");
		String str1 = reader.readLine();
		double num1 = Double.parseDouble(str1);
		System.out.println("ショコラ　　　>");
		String str2 = reader.readLine();
		double num2 = Double.parseDouble(str2);
		System.out.println("ピスターシュ>");
		String str3 = reader.readLine();
		double num3 = Double.parseDouble(str3);

		System.out.println("\nシトロン" + num1 + "個");
		System.out.println("ショコラ" + num2 + "個");
		System.out.println("ピスターシュ" + num3 + "個");

		double totalcount = num1 + num2 + num3;
		int sum = (int) (250 * num1 + 280 * num2 + 320 * num3);
		System.out.println("\n合計個数" + totalcount + "個");
		System.out.println("合計金額" + sum + "円");
		System.out.println("\nをお買い上げですね");
		System.out.println("承りました");
		pig1 = (int) (pig1 - num1);
		pig2 = (int) (pig2 - num2);
		pig3 = (int) (pig3 - num3);

		System.out.println("シトロン\\250残り…" + pig1 + "個");
		System.out.println("ショコラ\\280…残り" + pig2 + "個");
		System.out.println("ピスターシュ\\320…残り" + pig3 + "個");

		System.out.println("\n本日のおすすめ商品です\n");
		System.out.println("またのお越しをお待ちしております。");

		System.out.println("\n売り上げの割合");
		System.out.println("売上合計\\" + sum);
		System.out.println("\n内訳");
		System.out.println("シトロン\\" + (int) (250 * num1) + "・・・" + (int) ((250 * num1) / sum * 100) + "%");
		System.err.println("ショコラ\\" + (int) (280 * num2) + "・・・" + (int) ((280 * num2) / sum * 100) + "%");
		System.out.println("ピスターシュ\\" + (int) (320 * num3) + "・・・" + (int) ((320 * num3) / sum * 100) + "%");

	}

}
