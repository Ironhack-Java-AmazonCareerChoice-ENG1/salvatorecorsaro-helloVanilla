package com.ironhack;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello pizza world!");

        Pizza myFav1 = new Pizza();
        myFav1.setName("Salva's pizza");
        myFav1.setIngredients(List.of(
                Ingredient.TOMATO, Ingredient.MUSHROOM, Ingredient.PISTACHO
        ));
        myFav1.setStatus(PizzaStatus.IN_PREPARATION);

        Restaurant restaurant;

        System.out.println(myFav1);

        if (myFav1.getStatus() == PizzaStatus.IN_PREPARATION){
            System.out.println("Pizza is being prepared! (:");
        } else if (myFav1.getStatus() == PizzaStatus.IN_DELIVERY) {
            System.out.println("Pizza is going to be delivered soon! ;)");
        }

        myFav1.checkIfContainFavouriteIngredient(Ingredient.TOMATO);
    }
}