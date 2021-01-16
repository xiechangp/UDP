import java.io.IOException;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        String message="测试UDP";
        byte [] m=message.getBytes();
        DatagramPacket dp=new DatagramPacket(m,m.length);
        dp.setAddress(InetAddress.getByName("jxxy37"));//主机名
        dp.setPort(1699);
        DatagramSocket ds = new DatagramSocket();
        ds.send(dp);
    }
}
