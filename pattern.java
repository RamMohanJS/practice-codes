import java.util.*;

public class pattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows");

        int rows = sc.nextInt();

        System.out.println("** Printing the pattern... **");
        int f=1;
        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++)
            {
                
                if(f==1)
                {
                System.out.print(f + " ");
                f=0;
                }
                else {
                    System.out.print(f + " ");
                    f=1;
                }
            }
            System.out.println();
        }
          for (int i = 1; i <= rows; i++)
      {
          for (int j = 1; j <= i; j++)
          {
              System.out.print(" ");
         }
           for (int k = 1; k <= rows - i; k++)
           { if(f==1)
        {
            System.out.print(f + " ");
            f=0;
            }
            else {
                System.out.print(f + " ");
                f=1;
            }
          }
         System.out.println();
        }
    }
}