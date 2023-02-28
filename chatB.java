import java.io.*;
import java.net.*;
import java.util.*;

public class chatB {
    public static void main(String[] args) throws IOException {
    
        ServerSocket servsock = new ServerSocket(1243);
        Socket socket = servsock.accept();
        Scanner input = new Scanner(System.in);

        DataInputStream dis = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

        while (true) {

            while (true) {
                try {
                    String msg = dis.readUTF();
                    if (msg.equals("exit chat!")) {
                        System.out.println("exiting..");
                        socket.close();
                        dis.close();
                        dos.close();
                        break;
                    } else {
                        System.out.println("A: " + msg);
                    }

                    System.out.print("Enter message to be sent: ");
                    String m = input.nextLine();
                    dos.writeUTF(m);
                    if (m.equals("exit chat!")) {
                        System.out.println("exiting..");
                        socket.close();
                        dis.close();
                        dos.close();
                        break;
                    }
                } catch (Exception e) {
                    break;
                }  

            servsock.close();
            input.close();

            }
        }
    }
}
