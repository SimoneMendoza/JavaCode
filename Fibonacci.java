/*
  author:Simone Mendoza
  date:July 3, 2012
  This program will give an n number of Fibonacci numbers.
*/
import java.util.Scanner;
public class Fibonacci
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.printf("ENTER THE NUMBER OF FIBONACCI YOU WANT: ");

      int n = in.nextInt();
      int f;
      for (int i = 0; i <= n; i++)
      {
         f = fib(i);
         System.out.println("fib(" + i + ") = " + f);
      }
      System.exit(0);

   }

   /*
     Computes a Fibonacci number.
   */
   public static int fib(int n)
   {
      if (n < 2)
           return n;
      else
           return fib(n - 1) + fib(n - 2);
   }
}
