class Test extends Thread{
    public void run(){
        System.out.println("Thread " + Thread.currentThread().getId() + " is running");
    }
}

public class ThreadingMethods {
    public static void main(String[] args) {
        
        for(int i = 0; i < 5; i++){
            Test t = new Test();
            t.start();
        }
        for(int i = 0; i < 5; i++){
            System.out.println(i+" ");
        }
    }
}
