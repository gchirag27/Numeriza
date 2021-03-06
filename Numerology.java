import java.io.*;
public class Numerology
{
    public static void zodiac() throws IOException
    {
        BufferedReader obj1=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your birth date  (only the date  e.g., for 27/08/2002 enter 27)");               
        String a=obj1.readLine();
        System.out.println("Enter the month number of your birthday  (e.g., as in the above case,enter 08)");
        String x=obj1.readLine();       
        System.out.println();
        System.out.println("Your Zodiac Sign is: ");
        int month = Integer.parseInt(x);
        int day = Integer.parseInt(a);
        if((month==1 && day>=20 && day<=31)||(month==2 && day>=1 && day<=17))
        {
            System.out.println("Aquarius");
        }
        else if((month==2 && day>=18 && day<=29)||(month==3 && day>=1 && day<=19))
        {
            System.out.println("Pisces");
        }
        else if((month==3 && day>=20 && day<=31)||(month==4 && day>=1 && day<=19))
        {
            System.out.println("Aries");
        }
        else if((month==4 && day>=20 && day<= 30)||(month==5 && day>=1 && day<=20))
        {
            System.out.println("Taurus");
        }
        else if((month==5 && day>= 21 && day<= 31)||(month==6 && day>=1 && day<=20))
        {    
            System.out.println("Gemini");
        }
        else if((month==6 && day>= 21 && day<= 30)||(month==7 && day>=1 && day<=22))
        {
            System.out.println("Cancer");
        }
        else if((month==7 && day>= 23 && day<= 31)||(month==8 && day>=1 && day<=22))
        {
            System.out.println("Leo");
        }
        else if((month==8 && day>= 23 && day<= 31)||(month==9 && day>=1 && day<=22))
        {
            System.out.println("Virgo");
        }
        else if((month==9 && day>= 23 && day<= 30)||(month==10 && day>=1 && day<=22))
        {
            System.out.println("Libra");
        }
        else if((month==10 && day>= 23 && day<= 31)||(month==11 && day>=1 && day<=21))
        {
            System.out.println("Scorpio");
        }        
        else if((month==11 && day>= 22 && day<= 30)||(month==12 && day>=1 && day<=21))
        {
            System.out.println("Sagittarius");
        }
        else if((month==12 && day>= 22 && day<= 31)||(month==1 && day>=1 && day<=19))
        {
            System.out.println("Capricorn");
        }
        else
        {    
            System.out.println("Illegal date");
        }
    } 

    public static int Outer() throws IOException
    {
        BufferedReader buf2=new BufferedReader(new InputStreamReader(System.in));
        char a1[][]={{'A','B','C','D','E','F','G','H','I'},{'J','K','L','M','N','O','P','Q','R'},{'S','T','U','V','W','X','Y','Z',' '}};
        char a2[][]={{'a','b','c','d','e','f','g','h','i'},{'j','k','l','m','n','o','p','q','r'},{'s','t','u','v','w','x','y','z',' '}};
        System.out.println("Enter your first name as used in day to day conversations:");
        String g=buf2.readLine();
        int l=g.length();
        System.out.println("Length: "+l);
        int l2=l+1;
        char buf[]=new char[l2];
        g.getChars(0,1,buf,0);
        int h=0,s=0,r,sum=0;        
        for(int num=0;num<=l-1;num++)
        {
            h++;
            if((buf[num]!='A')&&(buf[num]!='E')&&(buf[num]!='I')&&(buf[num]!='O')&&(buf[num]!='U')&&(buf[num]!='a')&&(buf[num]!='e')&&(buf[num]!='i')&&(buf[num]!='o')&&(buf[num]!='u'))
            {
                for(int il=0;il<3;il++)
                {
                    for(int j=0;j<9;j++)
                    {
                        if(buf[num]==a1[il][j])
                        {                            
                            s+=(j+1);
                            System.out.println("Thus horoscope with number: "+s);
                        }
                        else
                        {
                            if(buf[num]==a2[il][j])
                            {
                                s+=(j+1);
                                System.out.println("Thus horoscope with number: "+s);
                            }
                        }
                    }
                }
            }
        }
        do
        {
            if(s>9&&s!=11&&s!=10&&s!=22)
            {
                int q=1;
                for(;q!=0;)
                {
                    r=s%10;
                    sum+=r;
                    q=s/10;s=q;
                }
                s=sum;
            }  
        }while(s>9&&s!=10&&s!=11&&s!=22);
        return s;
    }

    static int life() throws IOException
    {
        BufferedReader obj1=new BufferedReader(new InputStreamReader(System.in));
        int q=1,r,s=0,r1,s1=0,r2,s2=0,sum=0,r3,s3=0;               
        System.out.println("Enter your birth date  (only the date  e.g., for 27/08/2002 enter 27)");                
        String a=obj1.readLine();
        int d=Integer.parseInt(a);
        System.out.println("Enter the month number of your birthday  (e.g., as in the above case,enter 08)");
        String x=obj1.readLine();
        int m=Integer.parseInt(x);
        System.out.println("Enter the birth year  (e.g., as in the above case,enter 2002)");
        String b=obj1.readLine();
        int y=Integer.parseInt(b);   
        do
        {              
            q=1;s1=0;
            if(d>9&&d!=11&&d!=22)
            {              
                for(;q!=0;)
                {
                    r1=d%10;
                    s1+=r1;
                    q=d/10;
                    d=q;
                }
                d=s1;
            }
            else
            {
                s1=d;
            } 
        }while(s2>9&&s2!=11&&s2!=22);
        System.out.println("Date sum: "+s1);
        do
        {
            if(m!=11 && m>9)
            {
                q=1;s=0;
                for(;q!=0;)
                {
                    r=m%10;
                    s+=r;
                    q=m/10;
                    m=q;
                }
                m=s;
            }
            else
            {
                s=m;
            }
        }while(s>9&&s!=11&&s!=22);
        System.out.println("Month sum: "+s);
        do
        {              
            q=1;s2=0;
            if(y>9&&y!=11&&y!=22)
            {              
                for(;q!=0;)
                {
                    r2=y%10;
                    s2+=r2;
                    q=y/10;
                    y=q;
                }
                y=s2;
            }
            else
            {
                s2=y;
            } 
        }while(s2>9&&s2!=11&&s2!=22);
        System.out.println("Year sum: "+s2);
        sum=s+s1+s2;
        System.out.println("Total Sum: "+sum);
        do
        {
            if(sum>9&&sum!=11&&sum!=22)
            {
                q=1;s3=0;
                for(;q!=0;)
                {
                    r3=sum%10;
                    s3+=r3;
                    q=sum/10;
                    sum=q;
                }
                sum=s3;
            }
            else
            {
                s3=sum;
            }
        }while(sum>9&&sum!=11&&sum!=22);
        System.out.println("Sum of the above sum: "+s3);
        System.out.println("Thus horoscope with number: "+s3);
        return s3;
    }

    static void display(int var) throws IOException
    {
        if(var==0)
        {
            System.out.println("YOUR CHARACTER TRAITS:    Empty yet whole.");
            System.out.println("                          Essence of all things.");
            System.out.println("                          Accepting and creative");
            System.out.println();
            System.out.println("YOUR NEGATIVE TENDENCIES: Without form,shapeless.");
            System.out.println("                          Lack of detail.");
            System.out.println("                          Unorganized.");
        }
        else if(var==1)
        {
            System.out.println("YOUR CHARACTER TRAITS:    Exceptionally powerful and dominating personality.");
            System.out.println("                          Indiviualistic and intensely original & creative.");
            System.out.println("                          An inspired and inspiring leader and a pioneer.");
            System.out.println("                          Effecient and determine and good at initiating new projects.");
            System.out.println();
            System.out.println("YOUR NEGATIVE TENDENCIES: Stubborn and contrary.");
            System.out.println("                          Resenting authority,rarely seeking advice or following it.");
            System.out.println("                          Single Minded,willful,impatient and possibly quick tempered.");
            System.out.println("                          Obstinately proud and possibly difficult to deal with.");
        }

        else if(var==2)
        {
            System.out.println("YOUR CHARACTER TRAITS:    Good at comforting others,inclined to make up fads.");
            System.out.println("                          Co-operative and good natured,sympathetic and understanding, helpful and good at keeping a secret.");
            System.out.println("                          May be shy and timid.");
            System.out.println();
            System.out.println("YOUR NEGATIVE TENDENCIES: Unambitious,lacks self confidence,insecure and restless.");
        }
        else if(var==3)
        {
            System.out.println("YOUR CHARACTER TRAITS:    Enjoys being the centre of attention,tends to show off and loves to be admired.");
            System.out.println("                          Is quite more sensitive than exterior suggests.");
            System.out.println("                          Has a tendency to expend energies wastefully in too many directions.");
            System.out.println("                          With a love of pleasure also may be wasteful with money'. ");
            System.out.println();
            System.out.println("YOUR NEGATIVE TENDENCIES: Vain,gossipy and superficial");
        }
        else if(var==4)
        {
            System.out.println("YOUR CHARACTER TRAITS:    Steady and reliable.");
            System.out.println("                          Practical and sensible,calm.");
            System.out.println("                          Good at managing and saving money.");
            System.out.println("                          Courageous and honest and ethical in all they do.");
            System.out.println("                          Responsible,reliable and extremely dependable.");
            System.out.println();
            System.out.println("YOUR NEGATIVE TENDENCIES: Slow,plodding.");
            System.out.println("                          Over cautious,too conservative.");
            System.out.println("                          Suspicious,innovative and act like strangers.");
            System.out.println("                          Quick and violent tempered.");
        }
        else if(var==5)
        {
            System.out.println("YOUR CHARACTER TRAITS:    Versatile and resourceful,clever and amusing.");
            System.out.println("                          Good company,good with words,optimistic,lively.");
            System.out.println("                          Loves adventure and travel.");
            System.out.println("                          Hates to be tied down,impatient with rules,laws and conventions.");
            System.out.println();
            System.out.println("YOUR NEGATIVE TENDENCIES: Erratic,irritable,untidy,not punctual.");
            System.out.println("                          Jack of all trades,master of none-good at many things but not real good at anything.");
            System.out.println("                          Boastful,sarcastic and rebellious.");
        }
        else if(var==6)
        {
            System.out.println("YOUR CHARACTER TRAITS:    Equilibrium with others.");
            System.out.println("                          Enjoys peace between all people.");
            System.out.println("                          Values and enjoys beautiful things.");
            System.out.println("                          A negotiator and peace maker.");
            System.out.println();
            System.out.println("YOUR NEGATIVE TENDENCIES: Gossipy,limited outlook and unreasonable.");
        }
        else if(var==7)
        {
            System.out.println("YOUR CHARACTER TRAITS:    Quite meditative with a global perspective.");
            System.out.println();     
            System.out.println("YOUR NEGATIVE TENDENCIES: Aloof,solitary,isolated.");
            System.out.println("                          May be sensitive but not openly and sometimes pessimistic.");
        }
        else if(var==8)
        {
            System.out.println("YOUR CHARACTER TRAITS:    Ambitious for power,status,money and success.");
            System.out.println("                          May lead to great success or sudden failure.");
            System.out.println("                          Busy with world affairs.");
            System.out.println("                          The person may try to lead a life of constant effort trying to achieve their success in all matters");
            System.out.println("                          May avoid responsibilities  in private life");
            System.out.println();    
            System.out.println("YOUR NEGATIVE TENDENCIES: Selfish,chases materialistic waelth,self centered,thoughtless.");
        }
        else if(var==9)
        {
            System.out.println("YOUR CHARACTER TRAITS:    A true humanitarian, a strong desire to serve your fellow man.");
            System.out.println("                          High minded and idealistic, and is impressionable and quite independent.");
            System.out.println("                          May have a difficult early life,but will succeed through determination and resourcefulness.");
            System.out.println();  
            System.out.println("YOUR NEGATIVE TENDENCIES: Egostitical and conceited in deal with indiviuals.");
            System.out.println("                          Easily hurt and not much emotionally stable,may be quick tempered.");
        }
        else if(var==9)
        {
            System.out.println("YOUR CHARACTER TRAITS:    A true humanitarian, a strong desire to serve your fellow man.");
            System.out.println("                          High minded and idealistic, and is impressionable and quite independent.");
            System.out.println("                          May have a difficult early life,but will succeed through determination and resourcefulness.");
            System.out.println();  
            System.out.println("YOUR NEGATIVE TENDENCIES: Egostitical and conceited in deal with indiviuals.");
            System.out.println("                          Easily hurt and not much emotionally stable,may be quick tempered.");
        }
        else if(var==9)
        {
            System.out.println("YOUR CHARACTER TRAITS:    A true humanitarian, a strong desire to serve your fellow man.");
            System.out.println("                          High minded and idealistic, and is impressionable and quite independent.");
            System.out.println("                          May have a difficult early life,but will succeed through determination and resourcefulness.");
            System.out.println();  
            System.out.println("YOUR NEGATIVE TENDENCIES: Egostitical and conceited in deal with indiviuals.");
            System.out.println("                          Easily hurt and not much emotionally stable,may be quick tempered.");
        }
        else if(var==9)
        {
            System.out.println("YOUR CHARACTER TRAITS:    A true humanitarian, a strong desire to serve your fellow man.");
            System.out.println("                          High minded and idealistic, and is impressionable and quite independent.");
            System.out.println("                          May have a difficult early life,but will succeed through determination and resourcefulness.");
            System.out.println();  
            System.out.println("YOUR NEGATIVE TENDENCIES: Egostitical and conceited in deal with indiviuals.");
            System.out.println("                          Easily hurt and not much emotionally stable,may be quick tempered.");
        }
        else if(var==9)
        {
            System.out.println("YOUR CHARACTER TRAITS:    A true humanitarian, a strong desire to serve your fellow man.");
            System.out.println("                          High minded and idealistic, and is impressionable and quite independent.");
            System.out.println("                          May have a difficult early life,but will succeed through determination and resourcefulness.");
            System.out.println();  
            System.out.println("YOUR NEGATIVE TENDENCIES: Egostitical and conceited in deal with indiviuals.");
            System.out.println("                          Easily hurt and not much emotionally stable,may be quick tempered.");
        }

        else if(var==10)
        {
            System.out.println("YOUR CHARACTER TRAITS:    Exceptionally powerful and has a dominating personality.");
            System.out.println("                          Intensively original and creative.");
            System.out.println("                          Effecient and good at initiating new projects.");
            System.out.println(); 
            System.out.println("YOUR NEGATIVE TENDENCIES: Stubborn,rigid especially about their own ideas.");
            System.out.println("                          Depressed if cought up in the small deatils of life.");
            System.out.println("                          May be jealous.");
        }
        else if(var==11)
        {
            System.out.println("YOUR CHARACTER TRAITS:    Idealistic and visonary.");
            System.out.println("                          Highly sensitive and emotional.");
            System.out.println("                          Very determined in completing tasks.");
            System.out.println("                          Determined and aware of what others think.");
            System.out.println("                          God at comforting others,Co-operative and good natured,helpful and good at keeping a secret.");
            System.out.println();
            System.out.println("YOUR NEGATIVE TENDENCIES: Loving ideals more than fellow men,providing universal needs without appreciating human needs.");
            System.out.println("                          May be a dreamer rather than a doer.");
        }
        else if(var==12)
        {
            System.out.println("YOUR CHARACTER TRAITS:    Idealistic,detached,suspended between the physical and the spiritual world.");
            System.out.println("                          Highly sensitive and emotional.");
            System.out.println("                          Very determined in completing tasks.");
            System.out.println("                          Good natured and gets along with others.");
            System.out.println();
            System.out.println("YOUR NEGATIVE TENDENCIES: Perfectionaist.");
            System.out.println("                          A great need to find the spiritual within the physical world to the point of death.");
        }        
        else if(var==22)
        {
            System.out.println("YOUR CHARACTER TRAITS:    A lover of world peace.");
            System.out.println("                          Excellent common sense,practically and organizational abilities.");
            System.out.println("                          Ambitious and full of ideas.");
            System.out.println("                          Unconventional in thought and action.");
            System.out.println(); 
            System.out.println("YOUR NEGATIVE TENDENCIES: Lacks faith in others,leading to try to control people and manipulate them.");
            System.out.println("                          May become excessive and go to extremes");
        }        
    }
}