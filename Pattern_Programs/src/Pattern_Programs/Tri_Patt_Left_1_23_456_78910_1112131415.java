package Pattern_Programs;

public class Tri_Patt_Left_1_23_456_78910_1112131415 {
public static void main(String[] args) {
	int k=1;
	for (int i = 1; i <=5; i++) {
		
		for (int j = 1; j <= i; j++) {
			System.out.print(k+" ");
			k++;
		}
		System.out.println();
	}
}
}
