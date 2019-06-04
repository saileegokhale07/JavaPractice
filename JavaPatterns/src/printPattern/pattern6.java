package printPattern;

public class pattern6 {

	public static void main(String[] args) {
		int i,j,num=7;
		for(i=6;i>=0;i--) {
			for(j=0;j<=i;j++) {
				System.out.print(num--+" ");
			}
			System.out.println();
			num=i;
		}
	}
}