package com.ggic.jb01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapExample {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person(1L, "abc@gmail.com", "abc", "bcd"));
        people.add(new Person(2L, "xyz@gmail.com", "xyz", "bcd"));
        people.add(new Person(3L, "rty@gmail.com", "rty", "bcd"));

        Map<String, Person> peopleMap = people
                .stream()
                .collect(Collectors.toMap(Person::getEmail, person -> person));

        Person found = peopleMap.getOrDefault("asd@gmail.com", new Person(0L, "123@gmail.com", "123", "123"));
        if (found != null) {
            System.out.println(found);
        }


    }
}
