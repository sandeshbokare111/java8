package streams.integer;

import java.util.*;
import java.util.stream.Collectors;

public class O2ReturnSubList {
    static void main() {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50,40,30,60,50));
        List<Integer> collect = list.stream().skip(1).limit(2).collect(Collectors.toList());
        System.out.println(collect);

        //Second Highest from the list
        Optional<Integer> limit = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        if(!limit.isEmpty()){
            System.out.println(limit.get());
        }
    }
}
