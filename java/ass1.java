import java.util.Scanner;
class ass1
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int x,y;
    x=s.nextInt();
    if(x%3==0 && x%5==0)
      System.out.println("Good Number");
    else if(x%3==0 && x%5!=0)
      System.out.println("Bad Number");
    else if(x%5==0 && x%3!=0)
      System.out.println("Poor Number");
    else
      System.out.println("-1");
  }
}
