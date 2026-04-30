/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
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
 */

package lesson01.challenge07;

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
		double sum = 250 * num1 + 280 * num2 + 320 * num3;
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

	}

}
