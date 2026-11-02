package streams.integer;

import java.util.Arrays;
import java.util.List;

public class O6FlatMapOFListsofLists {
    static void main() {
       List<List<Integer>> list1 = Arrays.asList(Arrays.asList(1,2,3,4),
               Arrays.asList(3,4,5,6),
               Arrays.asList(3,4,5,6),
               Arrays.asList(7,8,1,2),
               Arrays.asList(9,10,5,6),
               Arrays.asList(11,12,7,8));
        List<Integer> list2 = list1.stream().flatMap(list -> list.stream()).distinct().toList();
        System.out.println(list2);
    }
}
