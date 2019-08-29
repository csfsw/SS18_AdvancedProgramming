import java.security.SecureRandom;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
public class MyThreadDemo{
    public static void main(String args[]){
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(t1);
        executor.execute(t2);
        executor.execute(t3);
        executor.shutdown();
        System.out.println("Main method completed its task");
    }
}
class MyThread implements Runnable{
    private static final  SecureRandom random= new SecureRandom();
    public void run(){
        System.out.printf("%s is going to sleep %n",Thread.currentThread().getName());
        try{
            Thread.sleep(random.nextInt(5000));
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
       System.out.printf("%s started execution after sleep %n",Thread.currentThread().getName());
    }
}