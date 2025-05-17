/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.filestask;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author user
 */

class student {
      private String name;
      private int age;
      
      
      public student(String name,int age)
      {
         this.name=name;
         this.age=age;
      
      }
      
      public String getName()
      {
          return name;
      }
      
       public int getAge()
      {
          return age;
      }

}
public class FilesTask {

    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        try {
              File file =new File ("students.txt");
              Scanner input=new Scanner(file);
              while (input.hasNext()){
                 String name=input.next();
                 int age =input.nextInt();
                 
                student s1= new student(name,age);
                students.add(s1);
              }
              
              input.close();
        } catch (FileNotFoundException e){
                System.out.println("File not found");
                return;
        }
        
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the Student name to get their age:");
        String searchName=in.nextLine();
        
        Integer age = getStudentAgeByName(students,searchName);
        if(age != null){
            
            System.out.println(searchName+"age is:"+ age);
        } else {
            
            System.out.println("student not found");
        }
        in.close();
        }
    
    public static Integer getStudentAgeByName(List<Student) students, String name){
        for (Student s: students){
        if (s.getName().equalsIgnoreCase(name)){
            return s.getAge();
        }
        }
        
       return null; 
    }
    
}
