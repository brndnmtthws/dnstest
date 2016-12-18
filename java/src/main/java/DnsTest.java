import java.net.InetAddress;

public class DnsTest {
  public static void main(String[] args) {
    try {
      for (String arg : args) {
        InetAddress[] addresses = InetAddress.getAllByName(arg);
        System.out.println("Resolved: " + arg);
        for (InetAddress address : addresses) {
          System.out.println(address.getHostAddress());
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.exit(1);
    }
  }
}
