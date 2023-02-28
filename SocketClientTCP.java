import java.io.*;
import java.net.*;
import java.util.*;
public class SocketClientTCP
{
    public static void main(String[] args) throws IOException
    {
        InetAddress ip = InetAddress.getLocalHost();
        int port = 1243;
        Scanner sc = new Scanner(System.in);
        Socket s = new Socket(ip, port);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        while (true)
        {
            System.out.print("Enter message to be sent: ");
            Scanner input = new Scanner(System.in);
            String m = input.nextLine();
            dos.writeUTF(m);
            System.out.println("sending message...");
            String ack = dis.readUTF();
            if (ack.equals("ack"))
            {
                System.out.println("acknowledgment recieved - message successfully sent");
            }
            dos.writeUTF("close");
            System.out.println("exiting...");
            input.close();
            break;
        }
        sc.close();
        s.close();
        dis.close();
        dos.close();
    }
}
