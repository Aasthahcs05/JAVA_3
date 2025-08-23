public abstract class student {
    int roll;
    public String name;//instane variable which is accessible in s1.
//    private String banking_password;
//    static String sec="AI-A";
//    student(){
//        System.out.println();
//   }
//    student(int r, String n)
//    {
//        int x;//local variable is not accessible in s1.
//        name=n;
//        roll=r;
//    }
    student(int roll, String name){
        this.roll=roll;
        this.name=name;
    }
    abstract void attend_class();
    abstract void give_exam();
    void register(){
        System.out.println("Name is"+name+" is registered student");
    }
//    student(student s)
//    {
//        name=s.name;
//        roll=s.roll;
//    }
//    void display()
//    {
//        int id;
//        System.out.println("name is "+name);
//        System.out.println("Id is "+roll);
//    }
}
