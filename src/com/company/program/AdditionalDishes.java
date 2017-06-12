package com.company.program;
import java.util.Set;
import java.util.HashSet;

/**
 * Created by Андрей on 10.06.2017.
 */
public class AdditionalDishes extends DishesOnNature {
    @Override
    public void start() {
        super.start();
        System.out.println();
        System.out.println("Дополнительные блюда");
        Set<String> spisokAddDishes = new HashSet<>();
        spisokAddDishes.add("4. Шурпа;");
        spisokAddDishes.add("5. Бограч;");
        spisokAddDishes.add("6. Уха;");
        for (String str: spisokAddDishes) {
            System.out.println(str);
        }
    }
}
