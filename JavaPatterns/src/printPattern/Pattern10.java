package printPattern;

public class Pattern10 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=7;i++) {
			for(int k =1;k<=i;k++)
				System.out.print(" ");
			for(j=i;j<=7;j++) {
				System.out.print(j);
			}
			System.out.println();
			
		}
		  for (i = 7; i >= 1; i--){ //Printing i spaces at the beginning of each row
			  for (j = 0; j < i; j++){
	                System.out.print(" ");
	                }   
	            //Printing i to rows value at the end of each row
	          for (j = i; j <= 7; j++){
	                System.out.print(j);
	         }
	            System.out.println();
	     }
	}
}
