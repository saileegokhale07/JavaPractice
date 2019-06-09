package printShapes;

public class Diamond {
	public static void main(String[] args) {
		int i,j, num1=5, num2=num1-1;
		for(i=1;i<=num1;i++) {
			for(j=1;j<=num2;j++) 
				System.out.print(" ");
			num2--;
			for(j=1;j<=2*i-1;j++) 
				System.out.print("*");
			System.out.println();
		}
		num2=1;
		for(i=1;i<=num1-1;i++) {
			for(j=1;j<=num2;j++) 
				System.out.print(" ");
			num2++;
			for(j=1;j<=2*(num1-i)-1;j++)
				System.out.print("*");
			System.out.println();
		}
	}
}