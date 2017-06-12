package com.company.program;
import java.util.List;
import java.util.LinkedList;

/**
 * Created by Андрей on 10.06.2017.
 */
public class DishesOnNature implements MyOneInterfejs {
    @Override
    public void start() {
        List<String> spisokDishes = new LinkedList<>();
        spisokDishes.add("1. Шашлык;");
        spisokDishes.add("2. Печеная кортошка;");
        spisokDishes.add("3. Печеные овощи.");

        System.out.println("Основные блюда на природе:");
        //System.out.println();
        for(int i = 0; i<spisokDishes.size(); i++)
        {
            System.out.println(spisokDishes.get(i));
        }
    }
}
