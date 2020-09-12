import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int p=0;p<t;p++)
        {
        long a=in.nextLong();
        long b=in.nextLong();
        long q=in.nextLong();
        List<Long> l=new ArrayList<Long>();
        for(int p1=0;p1<q;p1++){
            long l1=in.nextLong();
            long r=in.nextLong();
            long c=0;
            for(long j=l1;j<=r;j++){
                if(((j%a)%b)!=((j%b)%a) ){
                    c+=1;
                    
                }
            }
            l.add(c);
        }
        for(int i=0;i<l.size();i++)
        System.out.print(l.get(i)+" ");
        System.out.println();
        }
    }
}