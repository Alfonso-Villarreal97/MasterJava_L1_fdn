package ExamenJavaINB;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        // Primer paso, minus y eliminar espacios
        str = str.toLowerCase();
        str = str.replace(" ", "");

        int left = 0;
        int right = str.length() - 1;

        // Comparar caracter por caracter
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }
}
