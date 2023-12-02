package ABC321;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a=-1;
		boolean flag=true;
		while(N>0) {
			int b = N%10;
			if(a>=b) {
				flag = false;
			
			}
			N = N/10;
			a=b;
		}
		if(flag==true)System.out.println("Yes");
		else System.out.println("No");


		
		

	}
}


