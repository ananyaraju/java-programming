import java.io.*;
import java.net.*;
import java.util.*;

public class chatA {
    public static void main(String[] args) throws IOException {
        InetAddress ip = InetAddress.getLocalHost();
        int port = 1243;
        Scanner input = new Scanner(System.in);
        Socket s = new Socket(ip, port);

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        while (true) {

            while(true) {

                try {
                    System.out.print("Enter message to be sent: ");
                    String m = input.nextLine();
                    dos.writeUTF(m);
                    if (m.equals("exit chat!")) {
                        System.out.println("exiting..");
                        s.close();
                        dis.close();
                        dos.close();
                        break;
                    }

                    String msg = dis.readUTF();
                    if (msg.equals("exit chat!")) {
                        System.out.println("exiting..");
                        s.close();
                        dis.close();
                        dos.close();
                        break;
                    } else {
                        System.out.println("B: " + msg);
                    }
                } catch (Exception e) {
                    break;
                }
            }

            input.close();

        }
        
    }
}
