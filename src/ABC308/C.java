package ABC308;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//int[] suc = new int[N];
		Map<Integer,Double> suc =new HashMap<>(); 
		
		
		for(int i=0;i<N;i++) {
			double a=sc.nextDouble();
			double b=sc.nextDouble();
			suc.put(i+1, a/(a+b));
		}

		
		List<Entry<Integer, Double>> list = new ArrayList<>(suc.entrySet());
		list.sort(Entry.comparingByValue(Comparator.reverseOrder()));
		for(int i=0;i<N;i++) {
			System.out.print(list.get(i).toString().charAt(0));
			if(i!=N-1)System.out.print(" ");
		}
		
		//for(int i=0;i<N;i++);System.out.println(suc);
		

	}

}
