package printPattern;

public class Pattern13 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=7;i++) {
			for(j=1;j<=i;j++) 
				System.out.print(" ");
			for(j=i;j<=7;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(i=7;i>=1;i--) {
			for(j=i;j>=1;j--) 
				System.out.print(" ");
			for(j=i;j<=7;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
/* 1 2 3 4 5 6 7 
  2 3 4 5 6 7 
   3 4 5 6 7 
    4 5 6 7 
     5 6 7 
      6 7 
       7 
       7 
      6 7 
     5 6 7 
    4 5 6 7 
   3 4 5 6 7 
  2 3 4 5 6 7 
 1 2 3 4 5 6 7 */