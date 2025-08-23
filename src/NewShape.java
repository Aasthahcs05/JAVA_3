public class NewShape extends shape{
    //for method overriding method should have same name and same parameter
    public void draw(double l)//method override or runtime polymorphism
    {
        double area=l*l;
        System.out.println("new Area square "+area);
    }
}
