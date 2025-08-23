   public class employee {
    int eid;
    String ename;
    double esalary;
    static String eorg="TCS";

    public employee(int eid, String ename, double esalary) {
        this.eid = eid;
        this.ename = ename;
        this.esalary = esalary;
    }

    public void display()
    {
        eorg="Infosys";
        System.out.println("Emp ID: "+eid);
        System.out.println("Emp Name: "+ename);
        System.out.println("Emp Salary: "+esalary);
        System.out.println(eorg);
    }
   // private static void einfo()   // since this method is private it can only be used in the same class and not in MyEmployee class without inheritance
    public static void einfo() // static method does't need an object
    {
        System.out.println(eorg);
       // System.out.println(ename); //non static variable cant be used in static method
    }
}
