package unit2;

public class MyMain {
    public static void main(String[] args) {
        Thread th1=new Thread1();
        Thread th2=new Thread2();
        System.out.println(th1.getPriority());
        th1.setPriority(10);
        th2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(th1.getPriority());
        System.out.println(th1.getName());
        th1.setName("My Thread 1");
        System.out.println(th1.getName());
        th1.start();
        th2.start();
    }
}
