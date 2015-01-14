package receiver;
import java.net.*;
public class UDPreceiver {
	public static void main(String []args){
		try{
			DatagramSocket s=new DatagramSocket(3000);
			byte[] data=new byte[100];
			DatagramPacket paquet= new DatagramPacket(data,data.length);
			while(true){
				System.out.println("attente reception ...");
				s.receive(paquet);
				String st = new String(paquet.getData(),0,paquet.getLength());
				System.out.print("j'ai recu ["+st+"]");
				System.out.println("depuis la machine"+paquet.getAddress().getCanonicalHostName()+":"+paquet.getPort());
			}
		}catch(Exception ex){
			ex.printStackTrace();
			System.exit(1);
		}
	}

}
