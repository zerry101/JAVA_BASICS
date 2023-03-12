/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author macon
 */
public class demo {

    public static void main(String[] args) {

        Student st1;

        st1 = new Student();

        
        st1=new Student(0,"zis","abad");
        
        Dog d1=new Dog();
        d1.eating();
        System.out.println(d1.colour);
        d1.speak();
        
//        st1.studentCity = "ahmedabad";
////        st1.studentid=123;
//        st1.studentCity="delhi";
        
        st1.study();
        st1.studentDetails();
        System.out.println(st1.toString()); 
    }

}
