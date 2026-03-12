import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        long start = System.nanoTime();

        boolean isPalindrome = checkPalindrome(input);

        long end = System.nanoTime();

        long executionTime = end - start;

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");
    }




    private static boolean checkPalindrome(String input) {

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}