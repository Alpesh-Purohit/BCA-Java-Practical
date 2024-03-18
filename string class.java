/*
Design string class that performs string method ( equal,reverse string , change case trim )
*/

import java.util.Scanner;

public class CustomString {
    private String inputString;

    public CustomString(String inputString) {
        this.inputString = inputString;
    }

    public boolean isEqual(String compareString) {
        return this.inputString.equals(compareString);
    }

    public String reverseString() {
        return new StringBuilder(inputString).reverse().toString();
    }

    public String changeCase() {
        return inputString.toUpperCase();
    }

    public String trimString() {
        return inputString.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userString = scanner.nextLine();

        CustomString customString = new CustomString(userString);

        System.out.println("Is equal to 'hello': " + customString.isEqual("hello"));
        System.out.println("Reversed string: " + customString.reverseString());
        System.out.println("Uppercase: " + customString.changeCase());
        System.out.println("Trimmed string: " + customString.trimString());

        scanner.close();
    }
}
