import java.util.*;
class digits
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int a,sum=0;
   while(n!=0)
   {
    a=n%10;
    sum=(sum*10)+a;
    n=n/10;
  }
  System.out.println(sum);
}
}
