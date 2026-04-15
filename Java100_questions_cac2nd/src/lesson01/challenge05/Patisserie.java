/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

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
		int total = num1 + num2 + num3;
		System.out.println("合計個数" + total + "個");
		int sum = 250 * num1 + 280 * num2 + 320 * num3;
		System.out.println("合計金額" + sum + "円");
		System.out.println("\nをお買い上げですね");
		System.out.println("承りました。");
		//	System.out.println("\nをお買い上げですね");
		//	System.out.println("承りました");

	}

}
