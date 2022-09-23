import java.util.*;
import java.io.*;
class Initial
{
    public static void main(String args[])throws IOException            
        {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = in.nextLine();
        int l = s.length();
        String ns = "";
        for(int i=0; i<l; i++)
        {
          char ch = s.charAt(i);
            if(ch== ' ')
            {
               System.out.print(ns.charAt(0)+" ");
               ns="";
            }
            else {
                ns=ns+ch;
            }
        }
         
    }
}
// thanks for watching this will be available at my github page