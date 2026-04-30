/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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
		int num1 = Integer.parseInt(str1);
		System.out.println("ショコラ　　　>");
		String str2 = reader.readLine();
		int num2 = Integer.parseInt(str2);
		System.out.println("ピスターシュ>");
		String str3 = reader.readLine();
		int num3 = Integer.parseInt(str3);

		System.out.println("\nシトロン" + num1 + "個");
		System.out.println("ショコラ" + num2 + "個");
		System.out.println("ピスターシュ" + num3 + "個");

		int totalcount = num1 + num2 + num3;
		int sum = 250 * num1 + 280 * num2 + 320 * num3;
		System.out.println("\n合計個数" + totalcount + "個");
		System.out.println("合計金額" + sum + "円");
		System.out.println("\nをお買い上げですね");
		System.out.println("承りました");
		pig1 = pig1 - num1;
		pig2 = pig2 - num2;
		pig3 = pig3 - num3;

		System.out.println("シトロン\\250残り…" + pig1 + "個");
		System.out.println("ショコラ\\280…残り" + pig2 + "個");
		System.out.println("ピスターシュ\\320…残り" + pig3 + "個");

	}

}
