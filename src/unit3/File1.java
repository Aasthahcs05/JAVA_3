package Unit3;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class File1 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\Users\\Friends\\IdeaProjects\\AI A\\src\\unit3\\db.properties");
            Properties p = new Properties();
            p.load(fr);
            System.out.println(p.getProperty("user"));
            System.out.println(p.getProperty("admin"));
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
}
}
}