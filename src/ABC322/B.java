package ABC322;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		String S = sc.next();
		String T = sc.next();
		int result = 0;

		loop: for (int m = 0; m < M; m++) {
			if (T.charAt(m) == S.charAt(0))
				for (int n = 1; n < N; n++) {
					if (S.charAt(n) == T.charAt(m + n)) {
						if (n == N - 1) {
							result = 1;

							for (int mlast = M; mlast < 0; mlast--) {
								if (T.charAt(mlast) == S.charAt(N)) {
									int c = 1;
									for (int nl = N; nl < 0; nl--) {
										if (S.charAt(nl) == T.charAt(mlast - c)) {

											if (nl == 1) {
												result = 3;
												break loop;
											}
											c--;

										}

									}

								}
							
							}
							if(n==N-1)break;

						}

					}
				}
		}
		System.out.println(result);
	}

}
