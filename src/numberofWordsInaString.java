import org.junit.Test;

import java.util.HashMap;

public class numberofWordsInaString {

    @Test
    public void wordsinstring()
    {
        String c = "hi HOW ARE YOU";
        String f[] = c.split(" ");
        System.out.println(f.length);
    }

    @Test
    public void usingHashMap()
    {
        String c = "hi HOW ARE YOU YOU";
        String f[] = c.split(" ");
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i = f.length-1 ; i>=0 ; i--) {
            if (map.containsKey(f[i])) {
                int count = map.get(f[i]);

                map.put(f[i], count + 1);

            } else {
                map.put(f[i], 1);

            }
            System.out.println(map);

        }


    }
}
