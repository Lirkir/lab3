package ru.spb.herzen.ivt3;
// Kirill Nikolaev

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class App {
    public static void main(String[] args) {
        List<Integer> randomNumbers = new ArrayList();

        System.out.println("Генерация десяти чисел.");
        for (int i = 0; i < 10; i = i + 1) {
            randomNumbers.add((int) (Math.random() * ((100) + 1)));
            System.out.println(randomNumbers.get(i));
        }

        System.out.println("\nСортировка, фильтрация, умножение на 2.");
        Consumer<Integer> NumberCrusher = (x) -> {
            System.out.println(x * 2);
        };
        randomNumbers
                .stream()
                .filter(num -> num % 2 == 0)
                .sorted()
                .forEach(NumberCrusher);
    }
}
