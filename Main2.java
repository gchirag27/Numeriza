import java.io.*;
public class Main2 extends ShoppingPlaza
{
    void main2() throws IOException
    {
        String c=" ";
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        System.out.println("||||||||||     Welcome to the Shopping Plaza     ||||||||||");
        System.out.println("....       Take a look at the Grand New Stores of the mall       ....");
        System.out.println(":-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:");
        do
        {
            System.out.println();
            System.out.println("Enter 1 -----> PETER ENGLAND");
            System.out.println("Enter 2 -----> LEVI'S");
            System.out.println();
            System.out.println("Please Enter your Choice: ");
            String h=buf.readLine();
            int a=Integer.parseInt(h);
            int d;
            switch(a)
            {
                case 1:
                {
                    peter();
                    break;
                }
                case 2:
                {
                    levis();
                    break;
                }                
                default:
                {
                    System.out.println();
                    System.out.println("Invalid Choice");
                    break;
                }
            }
            System.out.println("To continue shopping in the plaza,type 'continue' or press 'enter' to recieve the bill.");
            c=buf.readLine();            
        }while(c.equalsIgnoreCase("continue"));
        System.out.println("**********************************************************");
        System.out.println("          Please Pay: $" + (totalcart+10.0)+ " (Incl. of Tax)" );
        System.out.println("                          THANK YOU. ");
        System.out.println("**********************************************************");
    }
}