package streams.integer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class O3PartionByOddAndEven {
    static void main() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(e -> e % 2 == 0));
        System.out.println(collect);
    }
}
