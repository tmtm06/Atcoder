package ABC308;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans_before=0;
		for(int i=0;i<8;i++) {
			int ans=sc.nextInt();
			if(100>ans||ans>675 ||ans%25!=0||ans<ans_before) {
				System.out.println("No");
				break;
			}
			if(i==7)System.out.println("Yes");
			ans_before=ans;
		}
	}

}
