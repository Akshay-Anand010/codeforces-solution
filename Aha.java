import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int p=0;p<t;p++)
        {
    int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    a[i]=in.nextInt();
    int one=0;
    int zero=0;
    for(int i=0;i<n;i++){
        if(a[i]==0)
        zero++;
        else
        one++;
    }
    if(zero>=one){
    System.out.println(zero);
    for(int j=0;j<zero;j++)
    System.out.print(0+" ");
    System.out.println();

        }
        else{
      if(one%2!=0)
      one--;
      System.out.println(one);
      for(int j=0;j<one;j++)
      System.out.print(1+" ");
    System.out.println();
        }
    }
}
}