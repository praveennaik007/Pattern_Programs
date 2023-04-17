package Pattern_Programs;

public class Tri_Right_Patt_1_12_123_1234_12345 {
public static void main(String[] args) {
	int n=5;
	for (int r = n; r >=1; r--) {
		int a=1;
		for (int c = 1; c <=n; c++) {
			if(c>=r)
			{
				System.out.print(a);
				a++;	
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
