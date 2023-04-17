package Pattern_Programs;

public class Hallow_Pirimid_Star {
public static void main(String[] args) {
	int n=5;
	int a=0;
	for (int r = 1; r <=n; r++) {
		for (int c = 1; c <2*n; c++) {
		if(r+c==n+1 || r+c==n+1+a || r==n)
			{
				System.out.print("* ");
				
			}
			else
			{
				System.out.print("  ");
			}
			
		}
		System.out.println();
		a=a+2;
	}
}
}
