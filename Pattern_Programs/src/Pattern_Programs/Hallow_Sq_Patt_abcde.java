package Pattern_Programs;

public class Hallow_Sq_Patt_abcde {
public static void main(String[] args) {
	char ch='a';
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= 5; j++) {
			if(i==1 || j==1 || i==5 || j==5)
			{
				System.out.print(ch++ +" ");
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
