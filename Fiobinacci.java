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
