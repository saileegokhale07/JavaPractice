package printPattern;

public class Pattern17 {

	public static void main(String[] args) {
		int i,j;
		for(i=0;i<=6;i++) {
			for(j=0;j<=6;j++) {
				if(i==j)
					System.out.print(j);
				else
					System.out.print(0);
			}
			System.out.println();
		}
	}

}
