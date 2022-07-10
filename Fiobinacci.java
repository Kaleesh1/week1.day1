package week1.day1;


public class Fiobinacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 11;
		int firstNum =0;
		int SecNum = 1;
		int sum = 0;
		System.out.println(firstNum);
		
		for (int i=1;i<n;i++) {
			sum = firstNum+SecNum;
			System.out.println(sum);
			firstNum = SecNum;
			SecNum = sum;
		}
	}
}


/*else {
	int n1=2;
	
	fib = fib + (i-n1);
	n1++;
	System.out.println(fib);
} 
			if (i == 0||i == 1) {
				System.out.println(i);
			} else {
				int n1=1;
				fib = fib+(i-n1);
				System.out.println(fib);
			}
			}
		 
*/