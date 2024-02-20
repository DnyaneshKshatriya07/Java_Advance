public class Thread_Pool implements Runnable {
    private int numberToPrint;

    Thread_Pool(int numberToPrint) {
        this.numberToPrint = numberToPrint;
    }

    @Override
    public void run() {
        System.out.println(numberToPrint + " " + Thread.currentThread().getName());
    }
}