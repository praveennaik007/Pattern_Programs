package Pattern_Programs;

public class Tri_Right_Patt_1_22_333_4444_55555 {
public static void main(String[] args) {
	int n=5;
	int a=1;
	for (int r = 5; r >=1; r--) {
		for (int c = 1; c <= n; c++) {
			if(c>=r)
			{
				System.out.print(n-r+1);
				
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
