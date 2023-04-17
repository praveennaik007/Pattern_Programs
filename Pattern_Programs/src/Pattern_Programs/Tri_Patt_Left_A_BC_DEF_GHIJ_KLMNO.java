package Pattern_Programs;

public class Tri_Patt_Left_A_BC_DEF_GHIJ_KLMNO {
public static void main(String[] args) {
	char ch='A';
	for (int i = 1; i <= 5; i++) {
		
		for (int j = 1; j <= i; j++) {
			System.out.print(ch+" ");
			ch++;
		}
		
		System.out.println();
	}
}
}
