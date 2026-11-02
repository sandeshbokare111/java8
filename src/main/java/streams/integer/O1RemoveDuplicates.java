package streams.integer;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Given the list of integer remove duplicates and sort them and order in desc
 * **/
public class O1RemoveDuplicates {
    static void main() {
        List<Integer> list = new ArrayList<>(Arrays.asList(5,3,2,6,5,4,3,5,4,6,7));

         /* Given the list of integer remove duplicates and sort them and order in desc */

        List<Integer> collect = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Duplicates removed and sorted in desc " +collect);


        /* Given the list of integer remove duplicates and sort them and order in desc */

        List<Integer> sqrs = list.stream()
                .filter(i->i%2 !=0).map(j->j*j).collect(Collectors.toList());
        System.out.println("Odd Square nums : "+sqrs);


    }
}