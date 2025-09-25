package unit2;

public class Thread1 extends Thread{
    public void run()
    {
        for(int i=1;i<11;i++)
        {
            System.out.println("Thread 1 "+ i);
        }
    }
}
