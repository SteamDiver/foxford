import java.io.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class sha {
    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
        File input = new File("input.txt");
        FileReader reader = new FileReader(input.getAbsoluteFile());
        String s = reader.toString();



        MessageDigest m=MessageDigest.getInstance("SHA-256");
        m.update(s.getBytes(),0,s.length());
        File output = new File("output.txt");
        PrintWriter out = new PrintWriter(output.getAbsoluteFile());
        out.print(new BigInteger(1,m.digest()).toString(16));
    }
}
