
class Demo extends Thread{
    public void run(){
        System.out.println("Thread running: ");
    }
}

public class ThreadingDemo {
    public static void main(String[] args) {
        Demo de = new Demo();
        de.start();
    }
}
