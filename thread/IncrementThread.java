public class IncrementThread extends Thread{
    private Counter counter;

    private  int incrementPerThread;
    public  IncrementThread(Counter counter, int incrementPerThread) {
        this.counter = counter;
        this.incrementPerThread = incrementPerThread;
    }

    @Override
    public  void  run() {
        for (int i = 0; i < incrementPerThread; i++) {
            try {
                counter.increment();
            } catch (InterruptedException e) {
                throw new  RuntimeException(e);
            }
        }
    }
}
