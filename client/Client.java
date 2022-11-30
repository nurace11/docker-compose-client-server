import java.net.*;
import java.util.*;

public class Client {
	public static void main(String... args) throws Exception {

		Socket socket = new Socket();
		socket.connect(new InetSocketAddress("localhost", 5000), 2500);

		Scanner scanner = new Scanner(socket.getInputStream());
		while(scanner.hasNextLine()){
			System.out.println(scanner.nextLine());
		}
	}
}
