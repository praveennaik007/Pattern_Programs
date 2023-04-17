package Pattern_Programs;

public class Hallow_Sq_Patt_Star_And_Mid_X_Symbol {
public static void main(String[] args) {
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= 5; j++) {
			if(i==1 || j==1 || i==5 || j==5 || i==j || i+j==5+1)
			{
				System.out.print("* ");
			}
			else
			{
			System.out.print("  ");
		}
		}
		System.out.println();
	}
}
}
