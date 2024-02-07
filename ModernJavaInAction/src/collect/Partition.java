package collect;

import example.Dish;
import example.Type;

import java.util.*;
import java.util.stream.Collectors;

import static example.Type.*;
import static java.util.stream.Collectors.*;

public class Partition {

    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, MEAT),
                new Dish("beef", false, 700, MEAT),
                new Dish("chicken", false, 400, MEAT),
                new Dish("fries", true, 500, OTHER),
                new Dish("rice", true, 350, OTHER),
                new Dish("fruit", true, 120, OTHER),
                new Dish("pizza", false, 600, OTHER),
                new Dish("prawns", false, 300, FISH),
                new Dish("salmon", false, 450, FISH)
        );

        Map<Boolean, Map<Type, List<Dish>>> vegetarianDishesByType = menu.stream()
                .collect(partitioningBy(Dish::isVegetarian,
                        groupingBy(Dish::getType)));

        for (Map.Entry<Boolean, Map<Type, List<Dish>>> booleanMapEntry : vegetarianDishesByType.entrySet()) {
            System.out.println(booleanMapEntry);
        }

        Map<Boolean, Dish> mostCaloricByVegetarian = menu.stream()
                .collect(partitioningBy(Dish::isVegetarian,
                        collectingAndThen(maxBy(Comparator.comparingInt(Dish::getCalories)),
                                Optional::get)));
        for (Map.Entry<Boolean, Dish> booleanDishEntry : mostCaloricByVegetarian.entrySet()) {
            System.out.println(booleanDishEntry);
        }

        Map<Boolean, Map<Boolean, List<Dish>>> part1 = menu.stream().collect(partitioningBy(Dish::isVegetarian,
                partitioningBy(d -> d.getCalories() > 500)));
        for (Map.Entry<Boolean, Map<Boolean, List<Dish>>> booleanMapEntry : part1.entrySet()) {
            System.out.println(booleanMapEntry);
        }

        Map<Boolean, Map<Boolean, List<Dish>>> part2 = menu.stream().collect(partitioningBy(Dish::isVegetarian,
                partitioningBy(Dish::isVegetarian)));
        for (Map.Entry<Boolean, Map<Boolean, List<Dish>>> booleanMapEntry : part2.entrySet()) {
            System.out.println(booleanMapEntry);
        }

        Map<Boolean, Long> part3 = menu.stream()
                .collect(partitioningBy(Dish::isVegetarian, counting()));
        for (Map.Entry<Boolean, Long> booleanLongEntry : part3.entrySet()) {
            System.out.println(booleanLongEntry);
        }
    }
}
