package Pattern_Programs;

public class Pirimid_Left_Star {
public static void main(String[] args) {
	int n=5;
	//Another Way.....
	int star=1;
	for (int i = 1; i <2*n; i++) {
		for (int j = 1; j <=star; j++) {
			System.out.print("*");
		}
		if(i<n)
		{
			star++;
		}
		else
		{
			star--;
		}
		System.out.println();
	}
	
	//One Way.....
//	for (int i = 1; i <=2*n-1; i++) {
//		for (int j = 1; j <=i; j++) {
//			if(j<=2*n-i)
//			{
//				System.out.print("*");
//			}
//		}
//		System.out.println();
//	}
}
}
