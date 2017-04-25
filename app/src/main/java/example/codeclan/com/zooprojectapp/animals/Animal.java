package example.codeclan.com.zooprojectapp.animals;

import java.util.ArrayList;

import example.codeclan.com.zooprojectapp.food_management.Edible;

/**
 * Created by user on 23/04/2017.
 */

public abstract class Animal {

    private String name;
    private String type;
    private char gender;
    private String maturity;
    protected ArrayList<Edible> belly;

    public Animal(String name, String type, char gender, String maturity){
        this.name = name;
        this.type = type;
        this.gender = gender;
        this.maturity = maturity;
        this.belly = new ArrayList<Edible>();
    }


    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public char getGender() {
        return gender;
    }

    public String getMaturity() {
        return maturity;
    }

    public int getBellySize() { return belly.size(); }

    public void eat(Edible edible){
        belly.add(edible);
    }

    public void sleep(){
        belly.clear();
    }

    public int totalNutrition(){
        int totalFood = 0;
        for(Edible food : belly){
            totalFood += food.getNutritionalValue();
        }
        return totalFood;
    }
}