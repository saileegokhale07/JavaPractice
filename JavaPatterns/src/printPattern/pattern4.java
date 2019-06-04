package printPattern;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j, num=7;
		for(i=7;i>=0;i--) {
			for(j=0;j<i;j++) {
				System.out.print(num--+" ");
			}
			System.out.println();
			num=7;
		}
	}
}
