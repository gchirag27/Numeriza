import java.io.*;
public class ShoppingPlaza 
{
    static double cart;    static double totalcart;
    static void peter() throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        String num,choice="";        int n=0;
        do{
            System.out.println();
            System.out.println("WELCOME TO PETER ENGLAND SHOWROOM..........");
            System.out.println("1. WHITE PURE COTTON SHIRTS");
            System.out.println("2. TROUSERS");
            System.out.println("3. JEANS");
            System.out.println("4. TIES");
            System.out.println();
            System.out.println("15% discount on shirt and 30% discount on trousers & jeans");
            System.out.println();
            System.out.println("Please type the number that indicates your choice of item to buy...1/2/3/4");
            String b=buf.readLine();
            System.out.println();
            int ch=Integer.parseInt(b);
            switch(ch)
            {
                case 1:
                {
                    System.out.println("The shirt will cost you $50 each after discount");
                    System.out.println("Please enter number of shirts: ");
                    num=buf.readLine();
                    n=Integer.parseInt(num);
                    System.out.println("Which size, S/M/L ?");
                    char sz=(char)buf.read();
                    System.out.println("The item has been added to your cart");
                    cart=(50*n);break;                    
                }
                case 2:
                {
                    System.out.println("The trouser will cost you $30 each after discount");
                    System.out.println("Please enter number of trousers: ");
                    num=buf.readLine();
                    n=Integer.parseInt(num);
                    for(int i=1;i<=n;i++)
                    {
                        System.out.println("Please select the colour for the trouser --->light grey,dark grey,black,brown");
                        String s=buf.readLine();
                        System.out.println("Please enter waist length: ");
                        String w=buf.readLine();
                        System.out.println("The item has been added to your cart");
                    }
                    cart=(30*n);break;
                }
                case 3:
                {
                    System.out.println("The jeans will cost you $25 each after discount");
                    System.out.println("Please enter number of jeans: ");
                    num=buf.readLine();
                    n=Integer.parseInt(num);
                    for(int i=1;i<=n;i++)
                    {
                        System.out.println("Please select the colour for the jeans --->light blue,dark blue,black,");
                        String s=buf.readLine();
                        System.out.println("Please enter waist length: ");
                        String w=buf.readLine();
                        System.out.println("The item has been added to your cart");
                    }
                    cart=(25*n);break;
                }
                case 4:
                {
                    System.out.println("The jeans will cost you $10 each after discount");
                    System.out.println("Please enter number of ties: ");
                    num=buf.readLine();
                    n=Integer.parseInt(num);
                    for(int i=1;i<=n;i++)
                    {
                        System.out.println("Please enter the colour of the tie.");
                        String s=buf.readLine();
                        System.out.println("The item has been added to your cart");
                    }
                    cart=(10*n);break; 
                }
                default:
                {
                    System.out.println("SORRY, the item entered is not available.");break;
                }
            }
        }while(choice.equalsIgnoreCase("yes"));
        totalcart+=cart;
    }

    static void levis() throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        String num,choice=" ";  int n=0;
        do{
            System.out.println("WELCOME TO LEVI'S SHOWROOM..........");
            System.out.println("1. DARK BLUE JEANS");
            System.out.println("2. LIGHT BLUE JEANS");
            System.out.println("3. BOOTS");
            System.out.println("4. PRINTED  SHIRTS");
            System.out.println();
            System.out.println("Each item will cost you $35");
            System.out.println();
            System.out.println("Please type the number that indicates your choice of item to buy...1/2/3/4");
            String b=buf.readLine();
            System.out.println();
            int ch=Integer.parseInt(b);
            switch(ch)
            {
                case 1:
                {
                    System.out.println("The jeans will cost you $35 each after discount");
                    System.out.println("Please enter number of jeans: ");
                    num=buf.readLine();
                    n=Integer.parseInt(num);
                    for(int i=1;i<=n;i++)
                    {
                        System.out.println("Please enter waist length: ");
                        String w=buf.readLine();
                        System.out.println("The item has been added to your cart");
                    }
                    cart=(35*n); break;
                }
                case 2:
                {
                    System.out.println("The jeans will cost you $35 each after discount");
                    System.out.println("Please enter number of jeans: ");
                    num=buf.readLine();
                    n=Integer.parseInt(num);
                    for(int i=1;i<=n;i++)
                    {
                        System.out.println("Please enter waist length: ");
                        String w=buf.readLine();
                        System.out.println("The item has been added to your cart");
                    }
                    cart=(35*n);break;
                }
                case 3:
                {
                    System.out.println("The boots will cost you $35 each after discount");
                    System.out.println("Please enter number of boots");
                    num=buf.readLine();
                    n=Integer.parseInt(num);
                    for(int i=1;i<=n;i++)
                    {
                        System.out.println("Please enter the colour of the boots");
                        String s=buf.readLine();
                        System.out.println("Please enter your foot length: ");
                        String w=buf.readLine();
                        System.out.println("The item has been added to your cart");
                    }
                    cart=(35*n);break;
                }
                case 4:
                {
                    System.out.println("The shirt will cost you $35 each after discount");
                    System.out.println("Please enter number of shirts: ");
                    num=buf.readLine();
                    n=Integer.parseInt(num);
                    for(int i=1;i<=n;i++)
                    {
                        System.out.println("Please select the colour");
                        String s=buf.readLine();
                        System.out.println("Which size, S/M/L ?");
                        char sz=(char)buf.read();
                        System.out.println("The item has been added to your cart");
                    }
                    cart=(35*n);break;
                }
                default:
                {
                    System.out.println("The choice is incorrect.");break;
                }
            }
        }while(choice.equalsIgnoreCase("yes"));
        totalcart+=cart;
    }
}