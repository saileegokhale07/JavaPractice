package printPattern;

public class Pattern15 {

	public static void main(String[] args) {
		int i,j,num1=1;
		for(i=1;i<=7;i++) {
			if(i%2==0) {
				num1=0;
			}
			else 
				num1=1;
			for(j=num1;j<=7;j++){
				if(j%2==0)
					System.out.print(0);
				else {
					System.out.print(1);}
			}System.out.println();
			
		}
	}

}
