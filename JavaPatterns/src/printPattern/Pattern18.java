package printPattern;

public class Pattern18 {

	public static void main(String[] args) {
		int i,j,num=1;
		for(i=0;i<=4;i++) {
			for(j=0;j<=i;j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}

	}

}
