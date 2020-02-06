package SwapNumbers;

import org.junit.Test;

public class swapLogic {

    @Test
    public void swapNumbers() // Using 3rd Variable
    {
        int a , b ,c ;

        a = 5 ;
        b= 6;

        System.out.println("Before Swap");
        System.out.println(a);
        System.out.println(b);
        c = a ;
        a = b;

        b = c;

        System.out.println("After Swap");
        System.out.println(a);
        System.out.println(b);
    }

    @Test
    public void swapNumberswithout3rdVariable()
    {
        int a , b ,c ;

        a = 5 ;
        b= 6;

        System.out.println("Before Swap");
        System.out.println(a);
        System.out.println(b);
       a = a+b;
       b= a-b;
       a = a-b;

        System.out.println("After Swap");
        System.out.println(a);
        System.out.println(b);
    }
}
