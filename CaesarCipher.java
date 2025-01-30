import java.util.Scanner;

public class CaesarCipher {

    // Method to encrypt the text using Caesar Cipher
    public static String encrypt(String text, int shift) {
        StringBuilder encryptedText = new StringBuilder();

        // Iterate through each character in the string
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            // Encrypt lowercase letters
            if (Character.isLowerCase(c)) {
                c = (char) (((c - 'a' + shift) % 26) + 'a');
            }
            // Encrypt uppercase letters
            else if (Character.isUpperCase(c)) {
                c = (char) (((c - 'A' + shift) % 26) + 'A');
            }

            encryptedText.append(c);
        }

        return encryptedText.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text to encrypt: ");
        String text = scanner.nextLine();

        System.out.print("Enter the shift value (key): ");
        int shift = scanner.nextInt();

        // Encrypt the text and print the result
        String encryptedText = encrypt(text, shift);
        System.out.println("Encrypted Text: " + encryptedText);

        scanner.close();
    }
}