import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int t=in.nextInt();
	for(int p=0;p<t;p++)
	{
	  int a=in.nextInt();
	  int b=in.nextInt();
	  int res=(Math.abs(a-b)+9)/10;
	  System.out.println(res);
}
}
}