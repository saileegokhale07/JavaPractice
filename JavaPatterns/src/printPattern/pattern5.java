package printPattern;

public class pattern5 {

	public static void main(String[] args) {
		int i,j,num=1;
		for(i=0;i<=7;i++) {
			for(j=7;j>i;j--) {
				System.out.print(num++);
			}
			System.out.println();
			num=1;
		}
	}
}
