/*
  author:Simone Mendoza
  date:July 3, 2012
  This program will give an n number of Fibonacci numbers.
  This program has a GUI input
*/
import javax.swing.JOptionPane;
public class FibonacciGUI
{
   public static void main(String[] args)
   {
      String input = JOptionPane.showInputDialog("ENTER THE NUMBER OF FIBONACCI YOU WANT: ");

      int n = Integer.parseInt(input);
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
