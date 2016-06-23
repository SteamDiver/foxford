import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.*;
import java.util.Arrays;

/**
 * Created by admin on 28.02.2016.
 */
public class hash {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        Cipher c = Cipher.getInstance("RSA");
        String s = "Hello, world!";
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        KeyPair pair = kpg.genKeyPair();
        PublicKey pub = pair.getPublic();
        PrivateKey priv = pair.getPrivate();

        c.init(Cipher.ENCRYPT_MODE, pub);
        byte[] cipher = c.doFinal(s.getBytes());
        System.out.println(Arrays.toString(cipher));

        Cipher decript = Cipher.getInstance("RSA");
        decript.init(Cipher.DECRYPT_MODE, priv);
        String sDecripted = new String(decript.doFinal(cipher));

        System.out.println(sDecripted);
    }
}
