package Pattern_Programs;

public class Tri_Patt_Left_z_yy_xxx_wwww_vvvvv {
public static void main(String[] args) {
	char ch='z';
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print(ch+" ");
		}
		ch--;
		System.out.println();
	}	
}
}
