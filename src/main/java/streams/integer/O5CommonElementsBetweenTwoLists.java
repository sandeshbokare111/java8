package streams.integer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class O5CommonElementsBetweenTwoLists {
    static void main() {
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = Arrays.asList(3,4,5,6);

        List<Integer> list = list2.stream().filter(i -> list1.contains(i)).toList();
        System.out.println(list);

        Set<Integer> set = new HashSet<>(list1);
        list2.stream().filter(e-> set.contains(e)).toList();
        System.out.println(set);
    }
}
