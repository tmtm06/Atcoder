package ABC328;

import java.util.Scanner;

public class B {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result=0;
		for(int i=1;i<N+1;i++) {
//			System.out.println("i="+i);
			int D=sc.nextInt();
			
			if(i<10||i%11==0) {
				
			
			int count=i;
			if(i>10) {
				count=i%10;
			}
			while(count<=D) {
				result++;
				if(i<10) {
				count=count*10+i;
				}else {
					count=count*10+(i%10);
				}
			}	
			}
		}
		System.out.println(result);

		}
}
