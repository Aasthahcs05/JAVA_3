package unit3;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Scanner;

public class treeSet1
{
    public static void main(String[] args)
    {
        SortedSet<Integer> ts=new TreeSet<>();
        {
            System.out.println("Enter the no. of elements");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for(int i=0;i<n;i++)
            {
                ts.add(sc.nextInt());
            }
            System.out.println(ts.subSet(2,5)); //no. given in input are returned
                                                // after sorting 2 inclusive 5 exclusive
                                         // but rememeber according to no. not according to index
        }
    }
}
