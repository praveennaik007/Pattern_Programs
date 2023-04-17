package Pattern_Programs;

public class Hallow_Pirimid_Rev_Star {
public static void main(String[] args) {
	int n=5;
	for (int r = 1; r <=n; r++) {
		for (int c = 1; c <2*n; c++) {
			if(r==1 || r==c || r+c==2*n)
			{
				System.out.print("* ");
				
			}
			else
			{
				System.out.print("  ");
			}
			
		}
		System.out.println();
	}
}
}
