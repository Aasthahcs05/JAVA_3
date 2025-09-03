package unit1;

//public class A {
//    protected void sum(int x, int y) {
//        int z = x+y;
//        System.out.println("Sum is "+z);
//    }
//}
public abstract class A{
    public void sum(int x, int y)
    {
        int z=x+y;
        System.out.println("sum is"+z);
    }
    public abstract void diff(int x, int y);
}
