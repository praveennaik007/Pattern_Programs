package Pattern_Programs;

public class Dimond_Patt {
public static void main(String[] args) {
	int n=5;
	int space=n-1;
	int star=1;
	for (int r = 1; r <2*n; r++) {
		for (int c = 1; c <=space; c++) {
			System.out.print(" ");
		}
		for (int i = 1; i <=2*star-1; i++) {
			System.out.print("*");
		}
		if(r<n)
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
