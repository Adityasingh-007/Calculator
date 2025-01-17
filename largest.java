package largest;

import java.util.Scanner;

public class largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner s = new Scanner(System.in)) {
			int a=s.nextInt();
			int b=s.nextInt();
			
			if(a<b) {
				System.out.println(b);
			}
			else {
				System.out.println(a);
			}
		}
	}

}
