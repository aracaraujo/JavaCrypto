import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

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