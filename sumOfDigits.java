import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int [n];
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<=i;j++)
        {
            sum+=a[j];
        }
    }
    System.out.println(sum);
}
}
