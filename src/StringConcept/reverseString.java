package StringConcept;

import org.junit.Test;

import java.util.Scanner;

public class reverseString {

    @Test
    public void reverse()
    {
        StringBuffer buffer = new StringBuffer("Automation");
        System.out.println(buffer.reverse());
    }


    @Test
    public void reverseusingBuilder()
    {
        StringBuilder build = new StringBuilder("AutomationBuilder");
        System.out.println(build.reverse());
    }

    @Test
    public void usingChar()
    {
        String x =  "Automation Reverse using char";
        char lis[] = x.toCharArray();
        int size = lis.length;
        for(int i = size-1; i>=0; i--)
        {
            System.out.print(lis[i]);
        }
    }


    @Test
    public void scannerFnctionality()//Using Split
    {
        String str;
        //Scanner obj = new Scanner(System.in);
        System.out.println("Enter the String to be reverse");
      //  str = obj.nextLine();
        str = "Gnanasekar";

        String listofCharacters[] = str.split("");
        for(int i = listofCharacters.length-1 ; i>=0;i--)
        {
            System.out.print(listofCharacters[i]);
        }
    }

    @Test
    public void simple()
    {
        String c = "ADF";
        for(int i = c.length()-1; i >=0;i--)
        {
            System.out.print(c.charAt(i));
        }
    }
}
