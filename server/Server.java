import java.net.*;
import java.io.*;
import java.time.*;

public class Server {
	public static void main(String[] args) throws Exception {
		System.out.println("Server started");
		while(true){

			try(ServerSocket ss = new ServerSocket(4000);
			    Socket socket = ss.accept()){

				System.out.println("Connection from: " + socket.getRemoteSocketAddress());
				PrintWriter writerOut = new PrintWriter(socket.getOutputStream(), true);
				writerOut.println("Welcome. Time is: " + LocalDateTime.now());
			}
		}
	}
}
