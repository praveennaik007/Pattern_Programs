package Pattern_Programs;

public class Tri_Patt_Left_A_AB_ABC_ABCD_ABCDE {
public static void main(String[] args) {
	for (int i = 1; i <= 5; i++) {
		char ch='A';
		for (int j = 1; j <= i; j++) {
			System.out.print(ch+" ");
			ch++;
		}
		System.out.println();
	}
}
}
