import java.io.*;
public class Project
{
    static  Project p=new Project();
    static  Main1 a=new Main1();
    static  Main2 b=new Main2();
    static  Main3 c=new Main3();
    public static void main(String args[]) throws IOException
    {
        System.out.println("<-<-<-<-<-<-<-<-<-<-<-\t WELCOME TO CHIRAG'S PROJECT \t->->->->->->->->->->->");
        String g="",exit="";      
        do
        {           
            BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("What would you like: ");
            System.out.println();
            System.out.println("Enter 1 -----> NUMEROLOGY");
            System.out.println("Enter 2 -----> SHOPPING IN THE PLAZA");
            System.out.println("Enter 3 -----> QUIZ");
            System.out.println("Enter 4 -----> EXIT");
            System.out.println();
            System.out.println("Please Enter your Choice: ");
            String o=obj.readLine();
            int v=Integer.parseInt(o);
            switch(v)
            {
                case 1:
                {
                    a.main1();
                    p.project1();
                }
                case 2:
                {
                    b.main2();
                    p.project1();
                }
                case 3:
                {
                    c.main3();
                    p.project1();
                }
                case 4:
                {
                    System.exit(0);
                }
            }
        }while(g.equalsIgnoreCase("yes"));
    }

    void project1() throws IOException
    {
        String g="",exit="";      
        System.out.println();
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What would you like: ");
        System.out.println();
        System.out.println("Enter 1 -----> NUMEROLOGY");
        System.out.println("Enter 2 -----> SHOPPING IN THE PLAZA");
        System.out.println("Enter 3 -----> QUIZ");
        System.out.println("Enter 4 -----> EXIT");
        System.out.println();
        System.out.println("Please Enter your Choice: ");
        String o=obj.readLine();
        int v=Integer.parseInt(o);        
        do
        {
            switch(v)
            {
                case 1:
                {
                    a.main1();
                    p.project1();
                }
                case 2:
                {
                    b.main2();
                    p.project1();
                }
                case 3:
                {
                    c.main3();
                    p.project1();
                }
                case 4:
                {
                    System.out.println("Thank You");
                    System.exit(0);
                }
            }
        }while(v==4);
    }
}