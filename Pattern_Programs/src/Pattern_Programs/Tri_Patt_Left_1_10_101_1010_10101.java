package Pattern_Programs;

public class Tri_Patt_Left_1_10_101_1010_10101 {
public static void main(String[] args) {
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= i; j++) {
			if(j%2==0)
			{
				System.out.print("0 ");
			}
			else
			{
				System.out.print("1 ");
			}
		}
		System.out.println();
	}
}
}
