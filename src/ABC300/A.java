package ABC300;

import java.util.Scanner;

class A{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int ans=A+B;
		int[] C = new int[N];
		for(int i=0;i<N;i++) {
			C[i]=Integer.parseInt(sc.next());
			if(C[i]==ans)System.out.println(i+1);
		}

		
	}
}