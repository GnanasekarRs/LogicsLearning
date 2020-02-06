import org.junit.Test;

public class primeNumber {

    @Test
    public void prime()
    {
        boolean status = false;
        int temp;
        int num = 101;
        for(int i = 2 ; i<=num/2 ;i++) {
            temp = num % i;
            System.out.println("Num : "+num);
            System.out.println("i = "+i);
            if (temp == 0) {
                System.out.println("Temp : "+temp);
                status = true;
                break;
            }
        }
           if(status)
           {
               System.out.println("Not a Prime Number");
           }else
           {
               System.out.println("Prime Number");
           }
        }
    }
