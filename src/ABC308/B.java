package ABC308;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();//皿の数
		int M=sc.nextInt();//高い皿の数
		int ans=0;
		
		String[] C = new String[N];
		String[] D = new String[M];
		int[] P = new int[M+1];
		for(int i=0;i<N;i++)C[i]=sc.next();
		for(int i=0;i<M;i++)D[i]=sc.next();
		for(int i=0;i<M+1;i++)P[i]=sc.nextInt();
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(C[i].equals(D[j])) {
					ans+=P[j+1];
					break;}
				else if(j==M-1)ans+=P[0];
			}
		}
		System.out.println(ans);

	}

}
