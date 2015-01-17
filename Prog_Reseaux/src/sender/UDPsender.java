package sender;
import java.net.*;

public class UDPsender {
	public static void main (String []args){
		try {
			DatagramSocket s = new DatagramSocket();
			byte[] data = new byte[100];
			String msg = "coucou";
			data = msg.getBytes();
			InetSocketAddress sa = new InetSocketAddress("127.0.0.1",3000);
			DatagramPacket paquet = new DatagramPacket(data,data.length,sa);
			s.send(paquet);
			//hi you test
		}catch(Exception ex){
			ex.printStackTrace();
			System.exit(1);
		}
	}
}
//hihihi
