import java.util.Scanner;

public class Factorial {

	public static int fact(int num) {
		int fact=1;
		while(num>0) {
			fact=fact*num;
			num--;
		}
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();
		
		while(testcase>0) {
			int num=sc.nextInt();
			
			System.out.print(" ");
			System.out.print(fact(num));
			
			testcase--;
		}
		sc.close();
	}

}
