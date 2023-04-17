package Pattern_Programs;

public class Tri_Right_Patt_5_54_543_5432_54321 {
public static void main(String[] args) {
	int n=5;
	for (int r = 5; r >=1; r--) {
		int a=5;
		for (int c = 1; c <=n; c++) {
			if(c>=r)
			{
				System.out.print(a);
				a--;
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
