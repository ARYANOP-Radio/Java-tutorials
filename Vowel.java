import java.util.*;
import java.io.*;
class Vowel
{
    public static void main(String args[])throws IOException            
        {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = in.nextLine();
        int l = s.length();
        String ns = "";
        for(int i=0;i<l;i++)
        {
            char ch = s.charAt(i);
            if(ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U')
            {
                ns=ns+ch;
            }
        }
         System.out.println("New String:"+ns);
    }
}