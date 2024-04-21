import java.util.Scanner;

public class RailFence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("1. Encrypt text");
        System.out.println("2. Decrypt text");
        System.out.print("Choose an option:");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.print("Enter text for encryption: ");
            String plainText = scanner.nextLine();
            plainText = plainText.replace(" ", "");

            System.out.print("Enter the key (number of rows): ");
            int key = scanner.nextInt();

            // Encrypt the text
            String encryptedText = encryption(plainText, key);
            System.out.println("Encrypted Text: " + encryptedText);

            // Decrypt the encrypted text to verify
            String decryptedText = decryption(encryptedText, key);
            System.out.println("Decrypted Text: " + decryptedText);

        } else if (choice == 2) {
            System.out.print("Enter text for decryption: ");
            String encryptedText = scanner.nextLine();

            System.out.print("Enter the key (number of rows): ");
            int key = scanner.nextInt();

            // Decrypt the text
            String decryptedText = decryption(encryptedText, key);
            System.out.println("Decrypted Text: " + decryptedText);

            // Re-encrypt the decrypted text to verify
            // String reEncryptedText = encryption(decryptedText.replace(" ", ""), key);
            // System.out.println("Re-encrypted Text: " + reEncryptedText);

        } else {
            System.out.println("Invalid choice. Please select 1 or 2.");
        }

        scanner.close();
    }

    static String encryption(String text, int key) {
        String encryptedText = "";

        boolean check = false;
        int j = 0;
        int row = key;
        int col = text.length();
        char[][] matrix = new char[row][col];

        for (int i = 0; i < col; i++) {
            if (j == 0 || j == key - 1) check = !check;
            matrix[j][i] = text.charAt(i);

            if (check) j++;
            else j--;
        }

        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++) {
                System.out.print(matrix[i][k] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++) {
                if (matrix[i][k] != 0)
                    encryptedText += matrix[i][k];
            }
        }
        return encryptedText;
    }

    static String decryption(String text, int key) {
        String decryptedText = "";
        boolean check = false;
        int j = 0;
        int row = key;
        int col = text.length();
        char[][] matrix = new char[row][col];

        for (int i = 0; i < col; i++) {
            if (j == 0 || j == key - 1) check = !check;
            matrix[j][i] = '*';

            if (check) j++;
            else j--;
        }


//        for(int i=0;i<row;i++){
//            for(int k=0;k<col;k++){
//                System.out.print(matrix[i][k]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println();

        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++) {
                if (matrix[i][k] == '*') {
                    matrix[i][k] = text.charAt(index);
                    index++;
                }
            }
        }

//
//        for(int i=0;i<row;i++){
//            for(int k=0;k<col;k++){
//                System.out.print(matrix[i][k]+" ");
//            }
//            System.out.println();
//        }

        j = 0;
        check = false;
        for (int i = 0; i < col; i++) {
            if (j == 0 || j == key - 1) check = !check;
            decryptedText += matrix[j][i];

            if (check) j++;
            else j--;
        }

        return decryptedText;
    }
}
