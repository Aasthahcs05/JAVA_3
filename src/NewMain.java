public class NewMain {
    public static void main(String[] args) {
        MyInterface m=new MyInterface();
        m.print();
        m.show();
//        m.say() // we cant create object of the method of the interface
    }
}
