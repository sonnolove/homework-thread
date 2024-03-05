public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        int numThreads = 6;
        int incrementsPerthread = 5;
        IncrementThread[] threads = new  IncrementThread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new IncrementThread(counter, incrementsPerthread);
            threads[i].start();
        }

        try {
            for (IncrementThread thread: threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}