package printPattern;

public class Pattern11 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=7;i++) {
			for(j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}