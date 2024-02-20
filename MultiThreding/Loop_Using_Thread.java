public class Loop_Using_Thread implements Runnable {
    private int numberToPrint;

    Loop_Using_Thread(int numberToPrint) {
        this.numberToPrint = numberToPrint;
    }

    @Override
    public void run() {
        System.out.println(numberToPrint + " " + Thread.currentThread().getName());
    }
}