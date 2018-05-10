import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class Server{
    public static void main(String args[]){
        try{
            ServerSocket serverlistener = new ServerSocket(3478);
            Socket soc = serverlistener.accept();
            PrintWriter pw = new PrintWriter(soc.getOutputStream(),true);
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            pw.println("Hellow world from server");
            System.out.println("Message from client: " + in.readLine());
            soc.close();
            serverlistener.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
       
    }
}
