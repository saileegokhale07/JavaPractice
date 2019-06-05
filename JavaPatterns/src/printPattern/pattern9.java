package printPattern;

public class pattern9 {

	public static void main(String[] args) {
		int i,j,num=1;
		for(i=7;i>=1;i--) {
			for(j=i;j>=1;j--) {
				System.out.print(num+++" ");
			}
			System.out.println();
			num=1;
		}
		for(i=2;i<=7;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(num+++" ");
			}
			num=1;
			System.out.println();
		}
	}

}
