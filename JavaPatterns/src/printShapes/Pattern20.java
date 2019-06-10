package printShapes;
import java.util.Scanner;
public class Pattern20 {

	public static void main(String[] args) {
		int i,j;
		System.out.println("Enter a number of rows between 1 to 9:");
		Scanner in = new Scanner(System.in);
		int rows = in.nextInt();
		for(i=1;i<=rows;i++) {
			for(j=rows;j>=i;j--)
				System.out.print(" ");
			for(j=1;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
	in.close();
	}
}