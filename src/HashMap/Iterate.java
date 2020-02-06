package HashMap;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Iterate {

    @Test
    public void iterateUsingHashMap()
    {
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");

        for(Map.Entry x : map.entrySet())
        {
            System.out.println("Key "+x.getKey() +" Value "+ x.getValue());
        }


        Iterator y = map.entrySet().iterator();
        while ((y.hasNext()))
        {
            Map.Entry z = (Map.Entry) y.next();
            System.out.println("Key "+z.getKey() +" Value "+ z.getValue());
        }


    }
}
