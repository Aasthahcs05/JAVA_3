package unit3;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylist2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> product=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            product.add(sc.next());
        }
        System.out.println(product);
        Collections.sort(product);
        System.out.println(product);
    }
}
