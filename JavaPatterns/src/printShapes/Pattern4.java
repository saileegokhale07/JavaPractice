package printShapes;

public class Pattern4 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=4;i++) {
			for(j=i;j<=4;j++) 
				System.out.print(" ");
			for(j=i;j>=1;j--)
				System.out.print(j);
			for(j=2;j<=i;j++)
				System.out.print(j);
			System.out.println();
		}
		for(i=3;i>=1;i--) {
			for(j=i-1;j<=3;j++) 
				System.out.print(" ");
			for(j=i;j>=1;j--)
				System.out.print(j);
			for(j=2;j<=i;j++)
				System.out.print(j);
			System.out.println();
		}
		
	}
}
/*
   1
  212
 32123
4321234
 32123
  212
   1
 */
 