import java.util.Scanner;

public class Vehicle_Manufacturing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                long v = sc.nextLong();
                long w = sc.nextLong();
                
                // Check boundary conditions and parity
                if (w % 2 != 0 || w < 2 * v || w > 4 * v) {
                    System.out.println("-1");
                } else {
                    long fourWheelers = (w - 2 * v) / 2;
                    long twoWheelers = v - fourWheelers;
                    System.out.println(twoWheelers + " " + fourWheelers);
                }
            }
        }
        sc.close();
    }
}
