package printShapes;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		int i,j;
		System.out.println("Enter a number between 1 to 9:");
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		for(i=1;i<=length;i++) {
			for(j=1;j<=i;j++)
				System.out.print(i);
			System.out.println();
		}
	in.close();
	}
}
