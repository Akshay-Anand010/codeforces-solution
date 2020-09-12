import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int t=in.nextInt();
    for(int p=0;p<t;p++)
    {
    int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    a[i]=in.nextInt();
    int res[]=new int[n-1];
    for(int i=0;i<n-1;i++)
    res[i]=a[i]+a[i+1];
    int b[]=new int[n];
    for(int i=0;i<n;i++)
    b[i]=a[n-i-1];
    for(int i=0;i<n;i++)
    System.out.print(b[i]+" ");
    }
  }
}