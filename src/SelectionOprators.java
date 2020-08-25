import java.util.Scanner;

public class SelectionOprators
{
    public static void main(String args[])
    {
        Scanner number=new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1=number.nextInt();
        System.out.println("enter the second number:");
        int num2=number.nextInt();
        while (num2==0)
        {
            System.out.println("enter the second number:");
             num2=number.nextInt();
        }
        double num3=(double)num1/num2;
        if(num3%2==0 && num3!=0)
        {
            System.out.println(num3+ " this is an even number ");
        }
        else if (num3==0)
        {
            System.out.println(num3+" the number is equal to zero");
        }
        else
        {
            System.out.println(num3+" this is an odd number");
        }

    }
}
