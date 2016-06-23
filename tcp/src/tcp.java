import java.io.*;
import java.net.Inet4Address;
import java.net.Socket;


public class tcp {
    public static void main(String[] args) throws IOException, InterruptedException {

        for (int i = 0; i < 64; i++) {
            Socket s = new Socket(Inet4Address.getByAddress(new byte[]{(byte) 186, (byte) 226, (byte) 160, (byte) 200}), 7051);


            //DataOutputStream output = new DataOutputStream(s.getOutputStream());

            //output.writeInt(2015);


            DataInputStream is = new DataInputStream(s.getInputStream());

            System.out.println(is.readInt());
            s.close();
            is.close();

        }
    }


}
