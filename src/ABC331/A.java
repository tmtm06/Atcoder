package ABC331;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int D = sc.nextInt();

		
		int y = sc.nextInt();
		int m= sc.nextInt();
		int d= sc.nextInt();
		d+=1;
		if(d >= D) {
			d=1;
			m+=1;
			if(m >= M) {
				m=1;
				y+=1;
			}
		}
		System.out.println(y+" "+m+" "+d);
		}
}
