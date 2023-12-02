package ABC322;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		boolean result=false;

		for (int i = 0; i < N-2; i++) {
			if (S.charAt(i) == 'A') {
				if (S.charAt(i + 1) == 'B') {
					if (S.charAt(i + 2) == 'C') {
						System.out.println(i+1);
						result=true;
						
						break;
					}

				}

			}

		}
		if(result==false)System.out.println(-1);

	}
}
