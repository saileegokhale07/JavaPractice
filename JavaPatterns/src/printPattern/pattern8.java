package printPattern;

public class pattern8 {

	public static void main(String[] args) {
		for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= i; j++){ //Printing first half of the row 
                System.out.print(j+" "); 
            } 
            for(int j=i-1;j>=1;j--) {
            	System.out.print(j+" ");
            }
            System.out.println();
        }
	}
}