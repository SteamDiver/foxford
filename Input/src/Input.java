


import java.io.*;
import java.util.Scanner;

/**
 * Created by admin on 23.06.2016.
 */
public class Input {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "Windows-1251"));
        String oldString = br.readLine();
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, "UTF-8"), true);
        pw.println(oldString);

    }
}
