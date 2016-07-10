import javax.xml.bind.DatatypeConverter;
import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class sha {
    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {

        File input = new File("input.txt");
        StringBuilder sb = new StringBuilder();
        BufferedReader in = new BufferedReader(new FileReader(input));
        String s;
        while ((s = in.readLine()) != null) {
            sb.append(s);
            sb.append("\n");
        }
        in.close();
        String text=sb.toString().trim();



        MessageDigest m = MessageDigest.getInstance("SHA-256");
        String outhash = DatatypeConverter.printHexBinary(m.digest(text.getBytes()));

        File output = new File("output.txt");
        BufferedWriter out = new BufferedWriter(new FileWriter(output));
        out.write(outhash);
        out.close();
    }


}
