import java.io.*;
import java.net.*;
public class Server{
    public static void main(String args[]){
        try{
            ServerSocket serverListener = new ServerSocket(1025);
            Socket clientSoc = serverListener.accept();
            PrintWriter pw = new PrintWriter(clientSoc.getOutputStream(),true);
            BufferedReader br = new BufferedReader(new InputStreamReader(clientSoc.getInputStream()));
            pw.println("Hi from server");  
            System.out.println("Message from client: " + br.readLine());
            clientSoc.close();
            serverListener.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
        

    }
}