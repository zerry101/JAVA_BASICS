/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author macon
 */
public class Student {

    int studentId;
    String studentName;
    String studentCity;
    
    
// Non parameterized constructor
     public Student() {
//         calling another constructor in a constructor
//         this(12,"zi","surat");
         System.out.println("non-parameterized constructor creating object....");    
    }
    
//     parameterized constructor
     public Student(int studentId,String studentName,String studentCity){
         this.studentId=studentId;
         this.studentName=studentName;
         this.studentCity=studentCity;
     }
   
    
    
//    Behaviour of class
    public void study(){
//        study();
        System.out.println(studentName+ "is studying");
    }
//    Behaviour of class
    public void studentDetails(){
        System.out.println("My name is "+this.studentName);
        System.out.println("My id is "+this.studentId);
        System.out.println("My city is "+this.studentCity);
        System.out.println();
    }
    
    @Override
    public String toString(){
    return this.studentId+this.studentCity+this.studentName;
    }
    
}
