package unit1;

public class shape {
    public void draw(double l, double b)
    {
        double area=l*b;
        System.out.println("Area Rectangle "+area);
    }
    public void draw(double l)
    {
        double area=l*l;
        System.out.println("Area square "+area);
    }
}