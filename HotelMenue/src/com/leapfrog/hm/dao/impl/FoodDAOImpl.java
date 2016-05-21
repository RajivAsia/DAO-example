/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.hm.dao.impl;

import com.leapfrog.hm.dao.FoodDAO;
import com.leapfrog.hm.model.Food;
import java.util.ArrayList;
import java.util.List;
import static org.omg.CORBA.AnySeqHelper.id;

/**
 *
 * @author lenovo
 */
public class FoodDAOImpl implements FoodDAO{
    List<Food> foodList = new ArrayList<>();

    @Override
    public int insert(Food f) {
        foodList.add(f);
        return 1;
    }

   

    @Override
    public int update(Food t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Food getById(int id) {
     for(Food f : foodList ){
         if(f.getFoodid()==id){
             return f;
             
             
         }
        
     }
     return null;
       
    }

    @Override
    public List<Food> getAll() {
       return foodList;
    }

    @Override
    public int delete(int id) {
        Food f=getById(id);
        if(f!=null){
            foodList.remove(f);
            return 1;
            
        }
        return 0;
    }
    
}
