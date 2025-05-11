import java.io.*;
import java.net.*;
import java.utils.*;

public class TCPServer{
public static void main (String []args) throws IOException {
    ServerSocket server=new ServerSocket(1234);
    Socket client = server.accpet();

    BufferedReader in = new BufferedReader(new InputSreamReader(client.getInputStream()));
    PrintWriter out=new PrintWriter(client.getOutputStream,true);
    String input = client.readLine();
    out.println(new StringBuilder(input).reverse.toString());
    client.close();
    server.close();
}
}
