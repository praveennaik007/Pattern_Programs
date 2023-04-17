package Pattern_Programs;

public class Tri_Patt_Left_z_zy_zyx_zyxw_zyxwv {
public static void main(String[] args) {
	
	for (int i = 1; i <= 5; i++) {
		char ch='z';
		for (int j = 1; j <= i; j++) {
			System.out.print(ch+" ");
			ch--;
		}
		System.out.println();
	}
}
}
