package Pattern_Programs;

public class Tri_Right_Patt_A_AB_ABC_ABCD_ABCDE {
public static void main(String[] args) {
	int n=5;
	
	for (int r = n; r >=1; r--) {
		char ch='A';
		for (int c = 1; c <=n; c++) {
			if(c>=r)
			{
				System.out.print(ch);
				ch++;
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
