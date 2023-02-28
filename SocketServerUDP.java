import java.io.IOException;
import java.net.*;
public class SocketServerUDP
{
  public final static int SERVICE_PORT=50001;
  public static void main(String[] args) throws IOException
  {
    try
    {
      DatagramSocket serverSocket = new DatagramSocket(SERVICE_PORT);
      byte[] receivingDataBuffer = new byte[1024];
      byte[] sendingDataBuffer = new byte[1024];
      DatagramPacket inputPacket = new DatagramPacket(receivingDataBuffer, receivingDataBuffer.length);
      serverSocket.receive(inputPacket);
      String receivedData = new String(inputPacket.getData());
      System.out.println("message recieved: "+receivedData);
      sendingDataBuffer = receivedData.toUpperCase().getBytes();
      InetAddress senderAddress = inputPacket.getAddress();
      int senderPort = inputPacket.getPort();
      DatagramPacket outputPacket = new DatagramPacket
      (
        sendingDataBuffer, sendingDataBuffer.length,
        senderAddress,senderPort
      );
      serverSocket.send(outputPacket);
      serverSocket.close();
    }
    catch (SocketException e)
    {
      System.out.println(e);
    }
  }
}