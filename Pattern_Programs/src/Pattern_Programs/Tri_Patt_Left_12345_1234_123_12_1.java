package Pattern_Programs;

public class Tri_Patt_Left_12345_1234_123_12_1 {
public static void main(String[] args) {
	int n=5;
	for (int r = 1; r <= n; r++) {
		int a=1;
		for (int c = 1; c <= n; c++) {
			if(c>=r)
			{
				System.out.print(a);
				a++;
			}
		}
		System.out.println();
	}
}
}
