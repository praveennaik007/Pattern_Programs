package Pattern_Programs;

public class Tri_Patt_Left_12345_6789_101112_1314_15 {
public static void main(String[] args) {
	int n=5;
	int a=1;
	for (int r = 1; r <= n; r++) {
		for (int c = 1; c <= n; c++) {
			if(c>=r)
			{
				System.out.print(a+" ");
				a++;
			}
		}
		System.out.println();
	}
}
}
