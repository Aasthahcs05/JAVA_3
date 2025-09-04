package unit3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Iterator;
public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> products=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            products.add(sc.next());
        }
        Iterator itr = products.iterator();//for traversing and getting the iterator
        while(itr.hasNext()) {//check if iterator has elements
            System.out.println(itr.next());
        }
        products.addLast("Lichi");
        products.addFirst("Apple");
        products.add(3,"Papaya");
       // Collections.sort(products);  //sorts according to asci value of 1st character
        System.out.println(products);
        System.out.println(products.getFirst());
        System.out.println(products.getLast());
    }
}