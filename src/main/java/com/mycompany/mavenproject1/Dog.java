/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author macon
 */
public class Dog extends Animal {

    int x = 4;

    public Dog() {
        super();
        System.out.println("this is dog");
    }
    
    

    public void speak() {
//below code will refer this class variable x
        System.out.println(this.x);

//below code will refer parent class variable x
        System.out.println(super.x);
    }
    
}
