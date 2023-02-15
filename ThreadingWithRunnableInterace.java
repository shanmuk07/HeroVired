
class Sample implements Runnable{
    public void run(){
        System.out.println("Thread " + Thread.currentThread().getId() + " is running");
    }
}

public class ThreadingWithRunnableInterace {
   public static void main(String[] args) {
    for(int i = 0; i < 5; i++){
        // Sample s = new Sample();
        // Thread t = new Thread(s);
        Thread t = new Thread(new Sample());
        t.start();
    }
    for(int i = 0; i < 5; i++){
        System.out.println(i+" ");
    }
   } 
}
