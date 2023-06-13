package com.ironhack;

import java.util.List;

public class Pizza {
    private String name;
    private List<Ingredient> ingredients;

    private PizzaStatus status;




    /**
     * A method that checks if pizza contains an ingredient
     * @param ingredient this will be checked against the list of pizza ingredients
     */
    public void checkIfContainFavouriteIngredient(Ingredient ingredient){
        var isPresent = ingredients.contains(ingredient);
        if(isPresent){
            System.out.println("You are lucky, " + ingredient + " is present! :D");
        } else {
            System.out.println("sorry, it doesn't have your favorite ingredient");
        }
    }


    public Pizza() {
    }

    public Pizza(String name, List<Ingredient> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                ", status=" + status +
                '}';
    }

    public PizzaStatus getStatus() {
        return status;
    }

    public void setStatus(PizzaStatus status) {
        this.status = status;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    ingredients
}

