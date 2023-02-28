import java.io.IOException;
import java.net.*;
import java.util.*;
public class SocketClientUDP
{
  public final static int SERVICE_PORT = 50001;
  public static void main(String[] args) throws IOException
  {
    try
    {
      DatagramSocket clientSocket = new DatagramSocket();
      InetAddress IPAddress = InetAddress.getByName("localhost");
      byte[] sendingDataBuffer = new byte[1024];
      byte[] receivingDataBuffer = new byte[1024];
      System.out.print("Enter message to be sent: ");
      Scanner input = new Scanner(System.in);
      String m = input.nextLine();
      sendingDataBuffer = m.getBytes();
      DatagramPacket sendingPacket = new DatagramPacket(sendingDataBuffer,sendingDataBuffer.length,IPAddress, SERVICE_PORT);
      clientSocket.send(sendingPacket);
      DatagramPacket receivingPacket = new DatagramPacket(receivingDataBuffer,receivingDataBuffer.length);
      clientSocket.receive(receivingPacket);
      String receivedData = new String(receivingPacket.getData());
      System.out.println("Sent from the server: "+receivedData);
      clientSocket.close();
      input.close();
    }
    catch(SocketException e)
    {
      System.out.println(e);
    }
  }
}