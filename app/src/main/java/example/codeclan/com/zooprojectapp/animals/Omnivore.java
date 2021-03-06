package example.codeclan.com.zooprojectapp.animals;

import example.codeclan.com.zooprojectapp.Interfaces.Edible;
import example.codeclan.com.zooprojectapp.food_management.FoodType;

/**
 * Created by user on 26/04/2017.
 */

public class Omnivore extends Animal{

    public Omnivore(String name, char gender, String maturity, String biome, int hunger, int price){
        super(name, gender, maturity, biome, hunger, price);
    }

    @Override
    public void eat(Edible food){
        if(food.getFoodType() == FoodType.INSECTS){
            belly.add(food);
        }
        else if(food.getFoodType() == FoodType.GRASS){
            belly.add(food);
        }
        else if(food.getFoodType() == FoodType.VEGETABLES){
            belly.add(food);
        }
        else if(food.getFoodType() == FoodType.MEAT){
            belly.add(food);
        }
        else if(food.getFoodType() == FoodType.FISH){
            belly.add(food);
        }
        else if(food.getFoodType() == FoodType.FRUIT){
            belly.add(food);
        }
        return;
    }

}
