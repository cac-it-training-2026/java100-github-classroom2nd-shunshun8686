package lesson02.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Detective {

	public static void main(String[] args) throws IOException {

		System.out.println("探偵：");
		System.out.println("犯人の可能性があるのはＮ氏か、Ｏ氏ですね。");
		System.out.println("この二人について他に情報はありませんか？\n");
		System.out.println("助手：");
		System.out.println("Ｎ氏は犬に嫌われるタイプですぐに吠えられます。逆にＯ氏は犬好きです。\n");
		System.out.println("探偵：");
		System.out.println("それだけじゃ犯人を特定できませんね。\n");
		System.out.println("依頼主：");
		System.out.println("ちなみに犯行当日は裏山に続く道は工事中で通れませんでした。\n");
		System.out.println("探偵：");
		System.out.println("じゃあ犯人がわかりました。\n");
		System.out.println("助手：");
		System.out.println("本当ですか！\n");
		System.out.println("探偵：");
		System.out.println("あなたが思う犯人は誰ですか？当ててみてください。\n");
		System.out.println("1．Ｎ氏");
		System.out.println("2．Ｏ氏");
		System.out.print("\n1か2をここに入力＞");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String numStr = br.readLine();
		int num = Integer.parseInt(numStr);
		String answer = (num == 1) ? "不正解です。" : "正解です。";
		System.out.println("\n探偵：");
		System.out.println(answer);
		//ここに記述する

	}

}
