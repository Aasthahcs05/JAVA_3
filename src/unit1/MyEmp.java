package unit1;

public class MyEmp {
    static{ //static block runs before any constructor, method, main method
        System.out.println("I am static block");
    }
    public static void main(String[] args) //main method is always static so that we dont have to create an object to call it
    {
//        employee e1=new employee(12,"ABC",200000);
//        e1.display();
        employee.einfo();
//        final int x;
//        x=12;
//        System.out.println(x);
    }
}
