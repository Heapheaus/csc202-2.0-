import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashTable {
    //For Exercises 43–46, use the following values:
    // 66, 47, 87, 90, 126, 140, 145, 153, 177, 285, 393, 395, 467, 566, 620, 735
    //46. Store  the  values  into  a  hash  table  that  uses  the  hash  function key  %  10 to determine which
    // of ten chains to put the value into
    //While I conceptually understand buckets, I don't understand how to code them. I couldn't find a decent guide on
    // the internet either
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put((66%10),"66");
        hmap.put((47%10),"47");
        hmap.put((87%10),"87");
        hmap.put((90%10),"90");
        hmap.put((126%10),"126");
        hmap.put((140%10),"140");
        hmap.put((145%10),"145");
        hmap.put((153%10),"153");
        hmap.put((177%10),"177");
        hmap.put((285%10),"285");
        hmap.put((393%10),"393");
        hmap.put((395%10),"395");
        hmap.put((467%10),"467");
        hmap.put((566%10),"566");
        hmap.put((620%10),"620");
        hmap.put((735%10),"735");
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            System.out.print("key is: " + mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }
        //test
    }
}