package collect;

import example.Dish;
import example.Type;

import java.util.*;

import static example.Type.*;
import static java.util.stream.Collectors.*;

public class CollectorExample {

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

        List<Dish> dishes = menu.stream().collect(
                ArrayList::new,
                List::add,
                List::addAll
        );

        for (Dish dish : dishes) {
            System.out.println(dish);
        }
    }
}
