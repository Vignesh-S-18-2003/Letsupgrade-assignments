import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean isPalindrome = true;
        for (int i = 0; i < cleanInput.length() / 2; i++) {
            if (cleanInput.charAt(i) != cleanInput.charAt(cleanInput.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The input is a palindrome.");
        } else {
            System.out.println("The input is not a palindrome.");
        }
    }
}
