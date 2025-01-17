package smallest;

import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner s = new Scanner(System.in)) {
			int a=s.nextInt();
			int b=s.nextInt();
			
			if(a<b) {
				System.out.println(a);
			}
			else {
				System.out.println(b);
			}
		}
	}

}
