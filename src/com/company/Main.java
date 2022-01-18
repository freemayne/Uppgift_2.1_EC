package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Person axe = new Person("Axe", "male", 25000);
        Person mars = new Person("Mars", "male", 28000);
        Person medusa = new Person("Medusa", "female", 30000);
        Person sven = new Person("Sven", "male", 36000);
        Person lina = new Person("Lina", "female", 33000);
        Person luna = new Person("Luna", "female", 22000);
        Person marci = new Person("Marci", "female", 27000);
        Person meepo = new Person("Meepo", "male", 40000);
        Person slardar = new Person("Slardar", "male", 34000);
        Person slark = new Person("Slark", "male", 20000);

        List<Person> personer = new ArrayList<>();
        personer.add(axe);
        personer.add(mars);
        personer.add(medusa);
        personer.add(sven);
        personer.add(lina);
        personer.add(luna);
        personer.add(marci);
        personer.add(meepo);
        personer.add(slardar);
        personer.add(slark);

        Map<String, Double> avgSalary = personer.stream()
                .collect(Collectors.groupingBy(Person::getGender,
                        Collectors.averagingDouble(Person::getSalary)));
        System.out.println(avgSalary);

        Person maxSalary = personer.stream()
                .max(Comparator.comparing(Person::getSalary))
                .get();
        Person minSalary = personer.stream()
                .min(Comparator.comparing(Person::getSalary))
                .get();


        System.out.println(maxSalary.getName() + "\n" + maxSalary.getSalary());
        System.out.println("---------------------");
        System.out.println(minSalary.getName() + "\n" + minSalary.getSalary());

    }
}
