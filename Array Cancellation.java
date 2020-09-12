import java.util.*;
public class Main
{
	public static void main(String[] args) {
   Scanner in=new Scanner(System.in);
   int t=in.nextInt();
   for(int p=0;p<t;p++)
   {
     int n=in.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
     a[i]=in.nextInt();
     int total=0;
     for(int i=0;i<n;i++){
         if(a[i]>0)
         total+=a[i];
else if(a[i]<0){
    int k=Math.min(total,-a[i]);
    a[i]+=k;
    total-=k;
}
     }
   long tot=0;
   for(int i=0;i<n;i++){
       if(a[i]<0)
       tot+=(long)Math.abs(a[i]);
   }
   System.out.println(tot);    
   }
}
}