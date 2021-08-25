import java.io.*;
public class Main3 extends Quiz
{
    void main3() throws IOException
    {        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String answer1="";
        System.out.println();
        System.out.println("#######     WELCOME TO THE WORLD OF QUIZ    #######");
        System.out.println();
        for(int i=0;i<99999;i++)
        {
            System.out.println();
            System.out.println("Enter 1 -----> SPORTS");
            System.out.println("Enter 2 -----> FOOD & DRINK");
            System.out.println("Enter 3 -----> MIXED BAG");            
            System.out.println();
            System.out.println("``````````   GET READY FOR THE BRAIN STORM   ``````````");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println();
            System.out.println("Each section will have 5 questions.");
            System.out.println("Each correct answer will give you 30 points.");
            System.out.println("Once one setion is started,one cannot exit.");
            System.out.println();
            System.out.println("Please Enter your Choice: ");
            String x=br.readLine();
            int y=Integer.parseInt(x);
            switch(y)
            {
                case 1:
                {
                    sports();
                    break;
                }
                case 2:
                {
                    fooddrink();
                    break;
                }            
                case 3:
                {
                    mixedbag();
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
            System.out.println("Want to play more ?$?$?$?$?$?$?$?$? (yes/no)");
            answer1=br.readLine();            
            if(answer1.equalsIgnoreCase("yes")||answer1.equalsIgnoreCase("y"))
            {
                continue;
            }
            else if(answer1.equalsIgnoreCase("no")||answer1.equalsIgnoreCase("n"))
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