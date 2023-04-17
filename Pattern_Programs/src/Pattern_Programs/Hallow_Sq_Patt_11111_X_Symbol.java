package Pattern_Programs;

public class Hallow_Sq_Patt_11111_X_Symbol {
public static void main(String[] args) {
	int n=5;
	for (int r = 1; r <=n; r++) {
		for (int c = 1; c <=n; c++) {
			if(r==1 ||r==n || c==1 || c==n || c+r==n+1 || c==r)
			{
				System.out.print(r+" ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
