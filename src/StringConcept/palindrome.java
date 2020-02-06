package StringConcept;

import org.junit.Test;

public class palindrome {

    @Test
    public void palidromeEx()
    {
        String x = "Nandhika";
        String reverse = "";
        char name[] = x.toCharArray();
        for(int i = name.length-1 ; i>=0 ; i--)
        {
            System.out.println("######");
            reverse = reverse + x.charAt(i);
           System.out.println(reverse);

        }
        System.out.println("********"+reverse);

        reverse = "Mental";
        reverse = reverse + 'k';
        System.out.println("********"+reverse);
        System.out.println("::::::::::::::::::::::::::::");
        reverse = reverse + "L";
        System.out.println("********"+reverse);

        System.out.println(x);

    }
}
