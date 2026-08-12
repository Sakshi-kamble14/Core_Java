import java.util.Scanner;

public class Good_Number {

	public static boolean isDivisible(int num) {
		
		int sum=0;
		int temp=num;
		while(temp>0) {
			sum+=temp%10;
			temp/=10;
		}
		
		return num%sum==0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int testcase=sc.nextInt();
		
		while(testcase>0) {
			int number=sc.nextInt();
			
			if(isDivisible(number)) {
				System.out.print("Good Number"+" ");}
			else
				System.out.print("Bad Number");
			testcase--;
		}
		
		sc.close();

	}

}
