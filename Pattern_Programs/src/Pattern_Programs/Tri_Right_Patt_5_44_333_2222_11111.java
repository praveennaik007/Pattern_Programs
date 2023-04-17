package Pattern_Programs;

public class Tri_Right_Patt_5_44_333_2222_11111 {
public static void main(String[] args) {
	int n=5;
	for (int r = 5; r >=1; r--) {
		for (int c = 1; c <=n; c++) {
			if(c>=r)
			{
				System.out.print(r);
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
