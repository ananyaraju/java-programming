import java.io.*;
import java.net.*;
public class SocketServerTCP
{
    public static void main(String[] args) throws IOException
    {       
        ServerSocket servsock = new ServerSocket(1243);
        Socket socket = servsock.accept();
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        while (true)
        {
            String m = dis.readUTF();
            System.out.println("message recieved: " + m);
            dos.writeUTF("ack");
            System.out.println("sending acknowledgment...");
            String ack = dis.readUTF();
            if (ack.equals("close"))
            {
                System.out.println("acknowledgment successfully sent");
                System.out.println("exiting...");
                break;
            }
        }
        servsock.close();
        socket.close();
        dis.close();
        dos.close();
    }
}
