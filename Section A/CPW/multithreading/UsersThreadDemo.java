import java.security.SecureRandom;
public class UsersThreadDemo{
    public static void main(String args[]){
        SimpleThread t1 = new SimpleThread();
        SimpleThread t2 = new SimpleThread();
        SimpleThread t3 = new SimpleThread();
        t1.start();
        t2.start();
        t3.start();
        System.out.printf("%s has done %n",Thread.currentThread().getName());
    }
}
class SimpleThread extends Thread{
    private static SecureRandom rndGen = new SecureRandom();
    @Override
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