package Pattern_Programs;

public class Pirimids_Square_X_Space_Star {
public static void main(String[] args) {
	int n=7;
	for (int r = 1; r <=n; r++) {
		for (int c = 1; c <=n; c++) {
			if(r==c || r+c==n+1)
			{
				System.out.print(" ");
			}
			else
			{
				System.out.print("*");
			}
		}
		System.out.println();
	}
}
}
