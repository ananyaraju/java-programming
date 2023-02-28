import java.util.*;
class panexception
{
    static void check_firstthree(String PAN)
    {
        for (int i=0; i<3; i++)
        {
            char temp=PAN.charAt(i);
            boolean check=Character.isAlphabetic(temp);
            if (!check)
                throw new NullPointerException("PAN is NOT valid: first 3 digits not alphabets");
        }
    }
    static void check_4th(String PAN)
    {
        int flag=0; char char4=PAN.charAt(3);
        char valid[]={'A','B','C','E','G','H','I','K','N','Q'};
        for (int i=0; i<10; i++)
            if (char4==valid[i])
                flag=1;
        if (flag!=1)
            throw new NullPointerException("PAN is NOT valid: 4th digit is not valid");
    }
    static void check_5th(String name, String fathername, String pan)
    {
        char char5=pan.charAt(4);
        char temp1=fathername.charAt(0);
        name=name.toUpperCase();
        char temp2=name.charAt(name.length()-1);
        if (temp1==char5 || temp2==char5)
            System.out.println("PAN might be valid");
        else
            System.out.println("PAN might not be valid: 5th digit is not valid");
        if (temp1==char5)
            System.out.println("PAN belongs to an individual");
        else if (temp2==char5)
            System.out.println("PAN belongs to a non-individual");
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String pan; String name; String fathername;
        for (int i=1; i<6; i++)
        {
            System.out.print("Details of person "+i+": ");
            pan=s.next();
            name=s.nextLine();
            fathername=s.nextLine();
            try
            {
                check_firstthree(pan);
                check_4th(pan);
                check_5th(name, fathername, pan);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            finally
            {
                s.close();
                System.out.println();
            }
        }
    }
}