package Pattern_Programs;

public class Tri_Patt_Left_54321_5432_543_54_5 {
public static void main(String[] args) {
	int n=5;
	for (int r = n; r >=1; r--) {
		int a=5;
		for (int c = 1; c <= n; c++) {
			if(c<=r)
			{
				System.out.print(a);
				a--;
			}
		}
		System.out.println();
	}
}
}
