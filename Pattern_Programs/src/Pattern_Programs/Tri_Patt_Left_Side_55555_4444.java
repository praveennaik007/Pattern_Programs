package Pattern_Programs;

public class Tri_Patt_Left_Side_55555_4444 {
public static void main(String[] args) {
	int n=5;
	for (int r = n; r >=1; r--) {
		for (int c = 1; c <=n; c++) {
			if(c<=r)
			{
				System.out.print(r+" ");
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
