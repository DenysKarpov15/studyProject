package com.ua.robot.homework23;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> lastnames = List.of("Barsunenko", "Stetsenko", "Avramenko", "Vchitilenko", "Ivanenko",
                "Barsunenko", "Avramenko", "Barsunenko", "Vchitilenko", "Avramenko", "Stetsenko", "Barsunenko",
                "Ivanenko", "Avramenko", "Mitchenko", "Stetsenko", "Barsunenko", "Suprenko", "Krykun", "Martynenko");

        Map<String, Long> lastnamesMap = lastnames.stream()
                .collect(Collectors.groupingBy(it -> it, Collectors.counting()));

        System.out.println(lastnamesMap);

        List<Integer> numbers = new ArrayList<>();
        int amount = 10;

        for (int i = 0; i < amount; i++) {
            Random random = new Random();
            numbers.add(random.nextInt(1, 101));
        }
        System.out.println(numbers);

        Integer sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }
}
