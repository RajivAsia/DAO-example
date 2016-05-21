/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.hm;

import com.leapfrog.hm.controller.ControllerFactory;
import com.leapfrog.hm.controller.MainController;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       while(true){
        System.out.println("1.Enter for Food");
        System.out.println("2.Enter for Customer");
        System.out.println("3.Enter for OrderList");
        System.out.println("4.Exit");
        System.out.println("Enter your choice ][1-4]");
       MainController controller =ControllerFactory.get(input.nextInt());
       if(controller !=null){
           controller.process();
       }
       else{
           System.out.println("invallied ");
       }
       }      
                
        
    }
    
}
