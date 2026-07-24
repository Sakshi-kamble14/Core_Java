import java.util.Scanner;

public class Two_Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        while (testCase-- > 0) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            int maxCount = -1;
            int rowIndex = -1;

            for (int i = 0; i < n; i++) {

                int count = 0;

                for (int j = 0; j < m; j++) {

                    int x = sc.nextInt();

                    if (x == 1)
                        count++;
                }

                if (count > maxCount) {
                    maxCount = count;
                    rowIndex = i;
                }
            }

            System.out.println(rowIndex);
        }

        sc.close();
    }
}