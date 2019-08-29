import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class Client{
    public static void main(String args[]){
        try{
            Socket soc = new Socket(args[0], 3478);
            PrintWriter toServer = new PrintWriter(soc.getOutputStream(),true);
            BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println("Message from server "+br.readLine());
            toServer.println(" Hello world from client");
            soc.close();
        }catch(Exception ex){
            System.out.println(ex);
        } 
    }
}