package Pattern_Programs;

public class Tri_Right_Patt_5_45_345_2345_12345 {
public static void main(String[] args) {
	
	int n=5;
	for (int r = 5; r >=1; r--) {
		for (int c = 1; c <=n; c++) {
			if(c>=r)
			{
				System.out.print(c);
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
