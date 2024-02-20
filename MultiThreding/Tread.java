import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tread {
    public static void main(String[] args) {

        //Hello World Program Using Thread
        HelloWorldThread helloWorldThread= new HelloWorldThread();
        Thread t1= new Thread(helloWorldThread);
        Thread t2 =new Thread(helloWorldThread);
        t1.start();
        t2.start();

        //Program to Printing the No. from 1 to 10 Using Thread
        for (int i = 1; i <= 10; i++) {
            Loop_Using_Thread n1 = new Loop_Using_Thread(i);
            Thread thread = new Thread(n1);
            thread.start();
        }

        //Hello World Program Using Thread Executor(Thread Pool).
        ExecutorService executorService = Executors.newFixedThreadPool(6);

        for (int i = 1; i <= 10; i++) {
            if (i == 2 || i == 5 || i == 8) {
                System.out.println("DEBUG");
            }

            Thread_Pool numberPrinter = new Thread_Pool(i);
            executorService.execute(numberPrinter);
        }
    }
}
