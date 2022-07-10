package week1.day1;


public class IsPrime {
	public static void main(String[] args) {
		
		int n = 138;
		int n2 = 0;
		for (int i=2;i<n;i++) {
			int n1=n%i;
//			System.out.println(n1);
			if (n1==0) {
				n2++;
//				System.out.println("inside if  "+n2);
			}
			}
		if (n2==0)
			System.out.println("Prime");
		else
			System.out.println("non-prime");
	}

}