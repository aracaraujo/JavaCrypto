import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class Encrypt {

    KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");
    SecretKey key = keyGenerator.generateKey();
    Cipher cipher = Cipher.getInstance("DES");


    public Encrypt() throws NoSuchAlgorithmException, NoSuchPaddingException {
    }

    public String Encrypting(String text) {
        byte[] bytesEncrypted;
        try {
            byte[] bytesText = text.getBytes("UTF8");
            this.cipher.init(Cipher.ENCRYPT_MODE, this.key);
            bytesEncrypted = this.cipher.doFinal(bytesText);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(Arrays.toString(bytesEncrypted));
        return new String(bytesEncrypted);
    }
//
    public String Decrypting(String text){
        byte[] bytesDecrypted;
        try {
            byte[] bytesText = text.getBytes("UTF8");
//            System.out.println(Arrays.toString(bytesText));
//            this.cipher.init(Cipher.DECRYPT_MODE, this.key);
//            bytesDecrypted = this.cipher.doFinal(bytesText);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return new String("test");
    }
}
