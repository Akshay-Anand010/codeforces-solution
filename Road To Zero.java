import java.util.*;
public class Main{
public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int t=in.nextInt();
  for(int p=0;p<t;p++)
  {
  long x=in.nextInt();
  long y=in.nextInt();
  long a=in.nextInt();
  long b=in.nextInt();
  long max=Math.max(x,y);
  long min=Math.min(x,y);
  long res=Math.abs(max-min);
  long res2=(x+y)*a;
  System.out.println(Math.min(res2,(res*a+min*b)));    
  }
}
}