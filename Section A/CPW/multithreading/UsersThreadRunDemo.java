import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsersThreadRunDemo{
    public static void main(String args[]){
        ExecutorService executor = Executors.newCachedThreadPool();
        UserThread t1 = new UserThread();
        UserThread t2 = new UserThread();
        UserThread t3 = new UserThread();
        executor.execute(t1);
        executor.execute(t2);
        executor.execute(t3);
        executor.shutdown();
        System.out.printf("%s has done %n",Thread.currentThread().getName());
    }
}
class UserThread implements Runnable{
    private static SecureRandom rndGen = new SecureRandom();
    public void run(){
        System.out.printf("%s is going to sleep %n",Thread.currentThread().getName());
        try{
            Thread.sleep(rndGen.nextInt(500));
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
        System.out.printf("%s has done %n",Thread.currentThread().getName());
    }
}