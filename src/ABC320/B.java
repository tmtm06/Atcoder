package ABC320;

import java.util.Scanner;

public class B {

	
    public static int isPalindrome(String str)
    {
    	int c=0;


        	for (int i = 0, j = str.length() - 1; i < j; i++, j--)
        	{
        		System.out.println(i);
        		if (str.charAt(i) != str.charAt(j)) {
        			return 0;
        		}
        		return c-i;
        	}

        
 
        return str.length()-(c*2);
    }
    
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int max=0;
		
		for(int count=0;count<=str.length()/2;count++) {
			int a =isPalindrome(str);
			if(a>max)max=a;
			
			System.out.println(max);
			
			
		}
		
	}

}
