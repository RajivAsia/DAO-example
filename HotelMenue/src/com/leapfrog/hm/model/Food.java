/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.hm.model;

/**
 *
 * @author lenovo
 */
public class Food {
    private int foodid,ammount;
    private String foodName, foodDescription;

    public Food() {
    }

    public Food(int foodid, int ammount, String foodName, String foodDescription) {
        this.foodid = foodid;
        this.ammount = ammount;
        this.foodName = foodName;
        this.foodDescription = foodDescription;
    }

    public int getFoodid() {
        return foodid;
    }

    public void setFoodid(int foodid) {
        this.foodid = foodid;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    @Override
    public String toString() {
        return "Food{" + "foodid=" + foodid + ", ammount=" + ammount + ", foodName=" + foodName + ", foodDescription=" + foodDescription + '}';
    }
    
}
