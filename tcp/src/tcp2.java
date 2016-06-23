import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Inet4Address;
import java.net.Socket;
import java.util.Scanner;


public class tcp2 {
    public static void main(String[] args) throws IOException {

        Socket s1 = new Socket(Inet4Address.getByAddress(new byte[]{(byte) 146, (byte) 185, (byte) 185, 118}), 10032);
        DataInputStream input1 = new DataInputStream((s1.getInputStream()));
        DataOutputStream out1 = new DataOutputStream((s1.getOutputStream()));
        Socket s2 = new Socket(Inet4Address.getByAddress(new byte[]{(byte) 146, (byte) 185, (byte) 185, (byte) 118}), 10032);
        DataInputStream input2 = new DataInputStream((s2.getInputStream()));
        DataOutputStream out2 = new DataOutputStream((s2.getOutputStream()));
        int x1 = input1.readInt();

        if (x1 != 0) {
            out2.writeInt(x1);
            System.out.println(input2.readInt());
        }
        int x2 = input2.readInt();
        if (x2 != 0) {
            out1.writeInt(x1);
            System.out.println(input1.readInt());
        }
        s1.close();
        s2.close();


    }
}
