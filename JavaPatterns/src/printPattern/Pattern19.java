package printPattern;

public class Pattern19 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=7;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}