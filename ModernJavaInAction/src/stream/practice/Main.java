package stream.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.*;

public class Main {
    public static void main(String[] args) {
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

        // 1. 2011년에 일어난 모든 트랜잭션을 찾아 값을 오름차순으로 정리하시오.
        List<Transaction> collect = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .toList();
        for (Transaction transaction : collect) {
            System.out.println(transaction);
        }

        // 2. 거래자가 근무하는 모든 도시를 중복 없이 나열하시오.
        List<String> cities = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .toList();
        for (String city : cities) {
            System.out.println(city);
        }

        // 3. 케임브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오.
        List<Trader> traders = transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .toList();

        for (Trader trader : traders) {
            System.out.println(trader);
        }

        // 4. 모든 거래자의 이름을 알파벳순으로 정렬해서 반환하시오.
        List<Trader> traders1 = transactions.stream()
                .map(Transaction::getTrader)
                .sorted(comparing(Trader::getName))
                .toList();

        for (Trader trader : traders1) {
            System.out.println(trader);
        }

        // 5. 밀라노에 거래자가 있는가?
        boolean milanResult = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println(milanResult);

        // 6. 케임브리즈에 거주하는 거래자의 모든 트랜잭션 값을 출력하시오.
        List<Transaction> transactions1 = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .toList();
        for (Transaction transaction : transactions1) {
            System.out.println(transaction);
        }

        // 7. 전체 트랜잭션 중 최댓값은 얼마인가?
        Optional<Integer> maxValue = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        System.out.println(maxValue);

        // 8. 전체 트랜잭션 중 최솟값은 얼마인가?
        Optional<Integer> minValue = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::min);
        System.out.println(minValue);
    }
}
