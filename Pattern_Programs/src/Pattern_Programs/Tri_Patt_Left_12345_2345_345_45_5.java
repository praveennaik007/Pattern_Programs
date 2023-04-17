package Pattern_Programs;

public class Tri_Patt_Left_12345_2345_345_45_5 {
public static void main(String[] args) {
	int n=5;
	
	for (int r = 1; r <= n; r++) {
		for (int c = 1; c <= n; c++) {
			if(c>=r)
			{
				System.out.print(c);
				
			}
			
		}
		System.out.println();
	}
}
}
