package ABC307;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int sum=0;
		for(int i=0;i<N*7;i++) {
			sum+=Integer.parseInt(sc.next());
			if((i+1)%7==0) {
				System.out.print(sum+" ");
				sum=0;
			}
		}
		

	}

}
