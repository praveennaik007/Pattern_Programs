package Pattern_Programs;

public class Tri_Patt_Left_Rev_Star {
public static void main(String[] args) {
	//One Approach 
	for (int i = 5; i >= 1; i--) {
		for (int j = 1; j <= i; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= 5; j++) {
			if(i+j<=6)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
