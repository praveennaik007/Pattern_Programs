package Pattern_Programs;

public class Pirimid_Right_Star {
public static void main(String[] args) {
	
	int n=5;
	int space=n-1;
	int star=1;
	for (int i = 1; i <2*n; i++) {
		for (int j = 1; j <=space; j++) {
			System.out.print(" ");
		}
		for (int k = 1; k <=star; k++) {
			System.out.print("*");
		}
		if(i<n)
		{
			space--;
			star++;
		}
		else
		{
			space++;
			star--;
		}
		System.out.println();
	}
}
}
