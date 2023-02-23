import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException {

        Encrypt encrypt = new Encrypt();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What text do you want to encrypt? ");
        String input = scanner.nextLine();

        String encryptText = encrypt.Encrypting(input);
        String decryptText = encrypt.Decrypting(encryptText);

        System.out.println(encryptText);
        System.out.println("");
        System.out.println(decryptText);

    }
}