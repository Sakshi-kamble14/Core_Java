import java.util.Scanner;

public class MaxCount {

	    public static int maxCount(String str1, String str2) {
	        int count = 0;

	        for (int i = 0; i < str2.length(); i++) {

	            // Skip duplicate characters in str2
	            boolean duplicate = false;
	            for (int k = 0; k < i; k++) {
	                if (str2.charAt(i) == str2.charAt(k)) {
	                    duplicate = true;
	                    break;
	                }
	            }

	            if (duplicate)
	                continue;

	            // Count occurrences in str1
	            for (int j = 0; j < str1.length(); j++) {
	                if (str2.charAt(i) == str1.charAt(j)) {
	                    count++;
	                }
	            }
	        }

	        return count;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int t = sc.nextInt();
	        sc.nextLine();

	        while (t-- > 0) {
	            String str1 = sc.nextLine().trim();
	            String str2 = sc.nextLine().trim();

	            System.out.println(maxCount(str1, str2));
	        }

	        sc.close();
	    }
	}