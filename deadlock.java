//    (Demonstrate deadlock) Write a program that demonstrates deadlock.
import java.util.concurrent.*;


public class deadlock {
   static int i = 0;
    public static void main(String[] args){

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new task1());
        executor.execute(new task2());
        executor.shutdown();
    }
    public static class task1 implements Runnable{
        public void run(){
            try{
                while(i==0){
                    wait();
                }
                i++;
                notifyAll();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public static class task2 implements Runnable{
        public void run(){
            try{
                while(i==0){
                    wait();
                }
                i++;
                notifyAll();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
