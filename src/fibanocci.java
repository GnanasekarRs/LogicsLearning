import org.junit.Test;

public class fibanocci {


    @Test
    public void fibo()
    {
        int a = 0,b=0,c=1;
        int y = 8;


        for(int i = 0 ; i<= y ; i++)
        {
            a = b;
            b = c;
            c =a + b;
            System.out.print(a);
        }

    }
}
