package streams.strings;

import java.util.*;

public class FindLongestStringFromList {
    static void main() {
        List<String> list = new ArrayList<>(Arrays.asList("Sandesh","Bokare","Java"));
        Optional<String> str = list.stream().max(Comparator.comparing(i->i.length()));
        System.out.println(str);
        if (str.isPresent()){
            System.out.println(str);

        }
    }
}
