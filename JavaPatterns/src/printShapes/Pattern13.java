package printShapes;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		int i,j;
		System.out.println("Enter a number between 1 to 9:");
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		int t = length;
		for(i=1;i<=length;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(t+" ");
				t--;
			}
			System.out.println();
			t=length;
		}
		in.close();
	}
}