import java.io.*;
import java.net.*;
public class Client{
    public static void main(String args[]){
        try{
            Socket soc = new Socket(args[0],1025);
            BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println("Message from server: " +br.readLine());
            PrintWriter pw = new PrintWriter(soc.getOutputStream(),true);
            pw.println("Hi from client");
        }catch(Exception ex){
            System.out.println(ex);
        }
       
    }
}