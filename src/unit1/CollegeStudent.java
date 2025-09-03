package unit1;

public class CollegeStudent extends Student1 {
    public int roll;

    public CollegeStudent(String address, int roll) {
        super(address);
        this.roll = roll;
    }
    public void show_roll()
    {
        System.out.println("Roll no. is "+roll);
    }
}
