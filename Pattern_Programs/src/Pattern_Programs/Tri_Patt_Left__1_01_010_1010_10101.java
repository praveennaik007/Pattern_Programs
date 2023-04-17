package Pattern_Programs;

public class Tri_Patt_Left__1_01_010_1010_10101 {
public static void main(String[] args) {
	int k=1;
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= i; j++) {
			if(k%2==0)
			{
				System.out.print("0 ");
			}
			else
			{
				System.out.print("1 ");
			}
			k++;
		}
		
		System.out.println();
	}
}
}
