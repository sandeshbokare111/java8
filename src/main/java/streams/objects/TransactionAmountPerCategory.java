package streams.objects;

import streams.objects.pojo.Transaction;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TransactionAmountPerCategory {
    static void main() {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("Food",100),
                new Transaction("Food",200),
                new Transaction("Food",150),
                new Transaction("Shopping",300),
                new Transaction("Shopping",250),
                new Transaction("Shopping",100),
                new Transaction("Utilities",400),
                new Transaction("Utilities",300),
                new Transaction("Entertainment",500),
                new Transaction("Entertainment",200),
                new Transaction("Travel",700),
                new Transaction("Travel",300)
        );
        Map<String, Integer> collect = transactions.stream().collect(Collectors.groupingBy(Transaction::getCategory, Collectors.summingInt(Transaction::getAmount)));
        System.out.println(collect);
    }
}

