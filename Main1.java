import java.io.*;
public class Main1 extends Numerology
{
    void main1() throws IOException
    {
        String answer=" ";
        System.out.println();
        System.out.println("^^^^^^^^^^    WELCOME TO YOUR FUTURE    ^^^^^^^^^^");
        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
        System.out.println();
        for(int i=0;i<99999;i++)
        {
            System.out.println();
            System.out.println("Enter 1 -----> ZODIAC SIGN");
            System.out.println("Enter 2 -----> OUTER EXPRESSION");
            System.out.println("Enter 3 -----> LIFE PATH");            
            System.out.println();
            System.out.println("Please Enter your Choice: ");
            BufferedReader obj1=new BufferedReader(new InputStreamReader(System.in));
            String f=obj1.readLine();
            int c=Integer.parseInt(f);
            int dd;            
            switch(c)
            {
                case 1:
                {
                    zodiac();
                    break;
                }
                case 2:
                {
                    dd=Outer();
                    display(dd);
                    break;
                }            
                case 3:
                {
                    dd=life();
                    display(dd);
                    break;
                }
                default:
                {
                    System.out.println();
                    System.out.println("Invalid Choice");
                    break;
                }
            }
            System.out.println();
            System.out.println("Anything more you want to know about your future(yes/no) ?!?!?!?!?!?!? ");
            answer=obj1.readLine();            
            if(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("y"))
            {
                continue;
            }
            else if(answer.equalsIgnoreCase("no")||answer.equalsIgnoreCase("n"))
            {
                break;
            }       
            else
            {
                System.out.println("Invalid Choice");
            }
        }
    }
}