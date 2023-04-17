package Pattern_Programs;

public class Tri_Patt_Left_11111_2222_333_44_5 {
public static void main(String[] args) {
	int n=5;
	for (int r = 1; r <= n; r++) {
		for (int c = 1; c <= n; c++) {
			if(c>=r)
			{
				System.out.print(r);
			}
		}
		System.out.println();
	}
}
}
