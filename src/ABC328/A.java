package ABC328;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int sum = 0;
		
		List<Integer> S = new ArrayList<>();
		for(int i=0; i<N;i++) {
			
			int tmp =sc.nextInt();
			if(tmp<=X) {
				sum +=tmp;
			}
		}
		System.out.println(sum);
		
		
		}
}
