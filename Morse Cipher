import java.util.*;

public class MorseCipher{


    private static final HashMap<Character, String> charToMorse = new HashMap<>();
    private static final HashMap<String, Character> morseToChar = new HashMap<>();

    static {

        charToMorse.put('A', ".-");
        charToMorse.put('B', "-...");
        charToMorse.put('C', "-.-.");
        charToMorse.put('D', "-..");
        charToMorse.put('E', ".");
        charToMorse.put('F', "..-.");
        charToMorse.put('G', "--.");
        charToMorse.put('H', "....");
        charToMorse.put('I', "..");
        charToMorse.put('J', ".---");
        charToMorse.put('K', "-.-");
        charToMorse.put('L', ".-..");
        charToMorse.put('M', "--");
        charToMorse.put('N', "-.");
        charToMorse.put('O', "---");
        charToMorse.put('P', ".--.");
        charToMorse.put('Q', "--.-");
        charToMorse.put('R', ".-.");
        charToMorse.put('S', "...");
        charToMorse.put('T', "-");
        charToMorse.put('U', "..-");
        charToMorse.put('V', "...-");
        charToMorse.put('W', ".--");
        charToMorse.put('X', "-..-");
        charToMorse.put('Y', "-.--");
        charToMorse.put('Z', "--..");
        charToMorse.put('0', "-----");
        charToMorse.put('1', ".----");
        charToMorse.put('2', "..---");
        charToMorse.put('3', "...--");
        charToMorse.put('4', "....-");
        charToMorse.put('5', ".....");
        charToMorse.put('6', "-....");
        charToMorse.put('7', "--...");
        charToMorse.put('8', "---..");
        charToMorse.put('9', "----.");


        for (Map.Entry<Character, String> entry : charToMorse.entrySet()) {
            morseToChar.put(entry.getValue(), entry.getKey());
        }
    }

    public static String encrypt(String text) {
        StringBuilder encryptedText = new StringBuilder();
        for (char c : text.toUpperCase().toCharArray()) {
            if (charToMorse.containsKey(c)) {
                encryptedText.append(charToMorse.get(c)).append(" ");
            } else if (c == ' ') {
                encryptedText.append("  ");
            }
        }
        return encryptedText.toString();
    }


    public static String decrypt(String morseCode) {
        StringBuilder decryptedText = new StringBuilder();
        String[] words = morseCode.split("  ");
        for (String word : words) {
            String[] letters = word.split(" ");
            for (String letter : letters) {
                Character ch = morseToChar.get(letter);

                if (ch != null) {
                    decryptedText.append(ch);
                }
            }
            decryptedText.append(" ");
        }
        return decryptedText.toString().trim();
    }


    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("1. Encryption Plain Text To Morse Code.\n2. Decryption Morse Code to Plain Text.\nChoose an option:");
        int choice = userInput.nextInt();
        userInput.nextLine();

        if (choice == 1) {
            System.out.print("Enter text for encryption: ");
            String plainText = userInput.nextLine();
            System.out.println();
            System.out.println("Encrypted text: " +encrypt(plainText));
            String decryptedText = decrypt(encrypt(plainText));
            System.out.println("Decrypted text: " + decryptedText);
        } else if (choice == 2) {
            System.out.println("Enter text for decryption: ");
            String morseCode = userInput.nextLine();
            System.out.println("");
            System.out.println("Decrypted text: " + decrypt(morseCode));
            System.out.println("");
            System.out.println("Encrypted text: " +encrypt(decrypt(morseCode)));
        } else {
            System.out.println("The choosen option is not valid");
        }
    }
}
