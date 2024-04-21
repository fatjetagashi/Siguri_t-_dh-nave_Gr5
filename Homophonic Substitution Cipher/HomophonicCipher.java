import java.util.*;


public class HomophonicCipher {
    private Map<Character, List<String>> encryptMap;
    private Map<String, Character> decryptMap;
    private Random random;

    public HomophonicCipher() {
        random = new Random();
        initialize();
    }

    private void initialize() {
        encryptMap = new HashMap<>();
        decryptMap = new HashMap<>();
        Set<String> usedCodes = new HashSet<>();  // Mbaj një set për të siguruar që të gjitha kodet janë unike

        // Frekuenca relative bazuar në anglisht
        int[] frequencies = {8, 2, 3, 4, 12, 2, 3, 6, 7, 1, 1, 4, 3, 7, 8, 2, 1, 6, 6, 9, 3, 1, 2, 1, 2, 1};

        // Alfabeti anglez
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        for (int i = 0; i < alphabet.length; i++) {
            char letter = alphabet[i];
            List<String> codes = new ArrayList<>();

            for (int j = 0; j < frequencies[i]; j++) {
                String code;
                do {
                    code = String.format("%02d", random.nextInt(100)) + String.format("%02d", random.nextInt(100));  // Gjenero kodin random
                } while (usedCodes.contains(code));  // Kontrollo nëse kodi është tashmë i përdorur
                usedCodes.add(code);
                codes.add(code);
                decryptMap.put(code, letter);
            }

            encryptMap.put(letter, codes);
        }
    }

    public String encrypt(String plaintext) {
        StringBuilder ciphertext = new StringBuilder();

        for (int i = 0; i < plaintext.length(); i++) {
            char ch = plaintext.toUpperCase().charAt(i);
            List<String> codes = encryptMap.get(ch);
            if (codes != null) {
                String code = codes.get(random.nextInt(codes.size()));
                ciphertext.append(code).append(" ");
            } else {
                ciphertext.append(ch).append(" ");  // Nëse nuk është shkronjë, lëre siç është
            }
        }

        return ciphertext.toString().trim();
    }
//Dekriptimi i Homophonic Substitution Cipher
public String decrypt(String ciphertext) {
        StringBuilder plaintext = new StringBuilder();
        String[] tokens = ciphertext.split(" ");

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            Character ch = decryptMap.get(token);
            if (ch != null) {
                plaintext.append(ch);
            } else {
                plaintext.append(token);  // Nëse nuk është kod i njohur, lëre siç është
            }
        }

        return plaintext.toString();
    }

    public void displayMappings() {
        System.out.println("Homophonic Mappings:");
        for (Map.Entry<Character, List<String>> entry : encryptMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        HomophonicCipher cipher = new HomophonicCipher();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the message to encrypt:");
        String message = scanner.nextLine();
        String encrypted = cipher.encrypt(message);
        String decrypted = cipher.decrypt(encrypted);

        System.out.println("Message: " + message);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
        cipher.displayMappings(); // Shfaq mapimet për verifikim
        scanner.close();
    }
}
