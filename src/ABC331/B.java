package ABC331;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();
//		double s = S/6;
//	    double m = M/6;
//		double l = L/6;
//		
//		double max = Math.max(s, m);
//		max = Math.max(max, l);
//		max = Math.max(max, s);
//		max = Math.max(max, m);
		int sum =999999;
//		for (int l =0;l<=L;l++) {
//			if(12*l<N) {
//			for(int m = 0;m<=M;m++) {
//				if(12*l+8*m<N) {
//				
//				for(int s = 0;s<=S;s++) {
//					if(6*s+8*m+12*l>=N && S*s+M*m +L*l <sum ) {
//						sum=S*s+M*m +L*l;
//					}
//				}
//				}
//			}
//			}
//		}
		for (int s =0;s<=N;s++) {

				for(int m = 0;m<=N;m++) {

						
						for(int l = 0;l<=N;l++) {
							if(6*s+8*m+12*l>=N && S*s+M*m +L*l <sum ) {
//								System.out.println(s+" "+m+" " +l+" ");
								sum=S*s+M*m +L*l;
							}
						}
					
				
			}
		}
		System.out.println(sum);
		
		
		
		}
}
