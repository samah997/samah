/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javamessage;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaMessage {
    
    public static void checkMessage(String Message)
    {
        
        String m="love";
        int index=0;
        for (int i=0; i< Message.length(); i++)
        {
              if (index < m.length() && Message.charAt(i) == m.charAt(index))
                  
                  index++;
        
        }
        
        if (index == m.length()){
        
            System.out.println("I love you too !");
        } else 
            System.out.println("Let us breakup!");

    }
    

    public static void main(String[] args) {
       
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a message:");
        String userMessage=input.nextLine();
        
        checkMessage(userMessage);
    }
}
