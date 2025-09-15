package unit3;
import java.util.Scanner;
import java.util.HashSet;
public class HashSet1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet <String> set=new HashSet();
        for(int i=0;i<n;i++)
        {
            set.add(sc.next());
            System.out.println(set.size());
        }
    }
}
