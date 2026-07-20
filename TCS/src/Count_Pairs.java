import java.util.Scanner;

public class Count_Pairs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();

        while (testcase > 0) {

            int size = sc.nextInt();
            int[] arr = new int[size];

            int even = 0, odd = 0;

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < size; i++) {
                if (arr[i] % 2 == 0)
                    even++;
                else
                    odd++;
            }

            int count = even * (even - 1) / 2 + odd * (odd - 1) / 2;

           
            System.out.print(count+" ");

            testcase--;
        }

        sc.close();
    }
}