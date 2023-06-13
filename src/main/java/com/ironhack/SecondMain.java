package com.ironhack;

import java.util.*;

import static com.ironhack.Ingredient.*;

public class SecondMain {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Guardiola", "+446754342");
        phoneBook.put("Messi", "+3366534534");
        phoneBook.put("Khan", "+2153687423");

        System.out.println(phoneBook.get("Messi"));

        Map<String, Pizza> menu = new HashMap<>();
        var pizza1 = new Pizza("Margherita", List.of(Ingredient.TOMATO, Ingredient.VEGAN_CHEESE, Ingredient.BASIL));
        var pizza2 = new Pizza("GreenHope", List.of(Ingredient.BROCCOLI, TOFU, BASIL, VEGAN_CHEESE));
        menu.put(pizza1.getName(), pizza1);
        menu.put(pizza2.getName(), pizza2);
        System.out.println("Margherita was ordered: " + menu.get("Margherita"));






        System.out.println(phoneBook);


        Set<String> registeredEmails = new HashSet<>();
        registeredEmails.add("first@mail.com");
        registeredEmails.add("second@mail.com");
        registeredEmails.add("first@mail.com");
        System.out.println(registeredEmails);

    }
}
