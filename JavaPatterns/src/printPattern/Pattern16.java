package printPattern;

public class Pattern16 {

	public static void main(String[] args) {
		int i,j,num=1;
		for(i=1;i<=5;i++) {
			num=i;
			for(j=1;j<=i;j++) {
				System.out.print(num+" ");
				num=num+(5-j);
			}
			System.out.println();
		}
	}
}