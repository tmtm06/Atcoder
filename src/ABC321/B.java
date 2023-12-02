package ABC321;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B {
	public static void main(String[] args) {
	// TODO 自動生成されたメソッド・スタブ
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int X = sc.nextInt();
	List<Integer> A = new ArrayList<>();
	
	
	for(int i=0;i<=N-2;i++) {
		A.add(sc.nextInt());
		
	}
	int min= Collections.min(A);
	int max = Collections.max(A);
	int sum = A.stream().mapToInt(Integer::intValue).sum();
	int point=sum-min-max;//さいごをかうん都する場合
	int last=X-point;

	if(point>=X||min==max)last=0;
	if(last>=max||last>100)last=-1;
	
	System.out.println(last);
}
}
