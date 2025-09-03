package unit1;

public class SchoolStudent extends student {
    SchoolStudent(int roll, String name)
    {
        super(roll,name);//super is important to use because without this we would have to use instance variable so creation of abstract class will go useless
    }
    public void attend_class(){
        System.out.println(name+" is attending class offline");
    }
    public void give_exam(){
        System.out.println(name+" is giving exam on pen and paper");
    }
}
