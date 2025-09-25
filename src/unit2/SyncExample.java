package Unit2;

public class SyncExample {
    public static void main(String[] args) throws InterruptedException{
        Unit2.Counter counter = new Unit2.Counter();
        Thread t1 = new Thread(()-> {
            for(int i=0; i<1000; i++) {
                counter.increment();
            }
        });
        Thread t2 = new Thread(()-> {
            for(int i=0; i<1000; i++) {
                counter.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
//        t2.join();
        System.out.println("Final Count "+counter.getCount());
    }
}