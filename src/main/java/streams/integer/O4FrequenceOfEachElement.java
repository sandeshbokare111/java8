package streams.integer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class O4FrequenceOfEachElement {
    static void main() {
        List<Integer> list = new ArrayList<>(Arrays.asList(3,2,3,4,4,1,2,1,1,1,5,6,5));
        Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(collect);
    }
}
