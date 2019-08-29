import java.security.SecureRandom;
import javax.naming.directory.DirContext;

public class DirThreadDemo{
    public static void main(String arg[]){
        DirThread t1 = new DirThread();
        DirThread t2 = new DirThread();
        DirThread t3 = new DirThread();
        t1.start();
        t2.start();
        t3.start();
        System.out.printf("%s had done %n",Thread.currentThread().getName());
    }
}
class DirThread extends Thread{
    static final SecureRandom gen = new SecureRandom();
    @Override
    public void run(){
        System.out.printf("%s is going to sleep %n", Thread.currentThread().getName());
        try{
            Thread.sleep(gen.nextInt(500));
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
        System.out.printf("%s had done %n",Thread.currentThread().getName());
    }
}