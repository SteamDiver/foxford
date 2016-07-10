import java.io.*;

/**
 * Created by admin on 09.07.2016.
 */
public class sosed {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File("input.txt")));
        String[] sinfo =reader.readLine().split(" ");
        int[][] info = new int[Integer.parseInt(sinfo[0])][Integer.parseInt(sinfo[1])];
    }
}
