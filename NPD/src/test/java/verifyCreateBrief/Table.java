package verifyCreateBrief;

import java.util.Scanner;

public class Table {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
			int a= sc.nextInt();
		
		int b=0;
		for(int i=1 ;i<=10 ; i++) {
			
			b=a*i;
//			System.out.println(b);
			System.out.println(a +" * "+ i +" = "+ b);
		
		}
		
	}
}
