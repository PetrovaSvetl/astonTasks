import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PuttingIntoPractice {

    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        transactions.stream().
                filter(transaction -> transaction.getYear() == 2011)
                .sorted((o1, o2) -> o1.getValue()- o2.getValue())
                .forEach(System.out::println);
        transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct().forEach(System.out::println);
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted((o1, o2) -> o1.compareTo(o2))
                .forEach(System.out::println);
        System.out.println(transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted((o1, o2) -> o1.compareTo(o2))
                .collect(Collectors.joining(",")));
        System.out.println(transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan")));
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(sum -> sum.getValue())
                .forEach(System.out::println);
        System.out.println(transactions.stream()
                .map(transaction -> transaction.getValue())
                .max((o1, o2) -> o1-o2).get());
        System.out.println(transactions.stream()
                .sorted((o1, o2) -> o1.getValue()- o2.getValue())
                .findFirst()
                .get());
    }
}

