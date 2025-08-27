import java.util.*;
public class Calculator {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x, y, z=0;
        System.out.println("Enter any two no. ");
//        x=sc.nextInt(); //to handle the exception while taking input take the input in try block not outside
//        y=sc.nextInt();
        try
        {

            x=sc.nextInt();
            y=sc.nextInt();
            z=x/y;
        }
        //try can have multiple catch but from least specific to most specific

        catch(NumberFormatException e)
        {
            System.out.println(e.getMessage());
        }
      catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally //finally always executes even if there is an exception
        {
            System.out.println(z);
        }
    }
}