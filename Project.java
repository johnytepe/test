/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Scanner;

/**
 *
 * @author Win10 Pro x64
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // make many methods and then put all them in main to print 
        
        
        printYourName ();
        printYearBorn();
        nameOfCityBorn();
        printAreYouMarried();
        favouriteColour();
        
    }
    
    
    public static void printYourName (){
        // Ask the user his first name and then print his first name
       // initialize string name and put input to take the answer
        Scanner sc =  new Scanner (System.in);
        String name = "";
        
        System.out.print("What is your name: ");
        name = sc.next();
        System.out.println("Dear " + name);
        
    }
    public static void printYearBorn(){
        Scanner sc =  new Scanner (System.in);
        // ask the user the year were born and then print the year
        // initialize Integer year 
        Integer year = 0;
        System.out.print("What year you were born: ");
        year = sc.nextInt();
        System.out.println("You were born in: " + year);
        
        // calculate the age and then print it
        Integer age = 0;
        Integer current_year = 2020;
        age = current_year - year;
        System.out.println("so you are : " + age);
        
         }
    
    public static void nameOfCityBorn(){
        Scanner sc =  new Scanner (System.in);
        // initialize string
       // ask the user the name of city were born and print the city were born
       String city = "";
        System.out.print("What is the name of the city you were born: ");
        city = sc.next();
        System.out.println("You were born in: " + city);
        
    }
    
    public static void printAreYouMarried(){
    // initialize String and ask the user :are you married
        Scanner sc =  new Scanner (System.in);
        Integer years_married = 0;
        String married= "";
        String yes= "yes";
        Integer year = 0;
        Integer current_year = 2020;
        
        
        System.out.print("Are you married: ");
        married = sc.next();
        
        // make conditional statement if: to determine the next question 
        // user must  to answer  with: yes or no
        if (yes.equals(married)){
            
            // if the answer is yes ask how many years is married
        System.out.print("How many years have you been married: ");
        years_married = sc.nextInt();
       
            System.out.println("You have been married for: " + years_married);
            
            // calculate the year of married
            year = current_year - years_married;
            System.out.println("You got married in: " + year);
            
            // initialize string for children answer and print the question for childrens
            String children = "";
            System.out.print("Do you have any children: ");
            children = sc.next();
            
         // make conditional statement if: to determine the next question 
        // user must  to answer  with: yes or no
            if (yes.equals(children)){
                
              // if the answer is yes ask how many How many children do you have 
                System.out.print("How many children do you have: ");
                
                // Initialize children number and print how many are
                Integer children_number= 0;
                children_number = sc.nextInt();
                
                System.out.println("You have " + children_number + " children");
                
                
            // make loop (for) to making question about the name and ages of childrens 
            // the number of iterations depends on the answer of user
            
            for (int i = 0; i < children_number; i++) {
               
                Integer age_children = 0;
            String name_children = "";
            Integer numberofchildrens;
           
                System.out.print("What is the name of your child: ");
                name_children= sc.next();
                System.out.print("What is the age of your child: ");
                
                age_children =sc.nextInt();
               
                // print these and put inside some variables with the name age and numbers of childrens
                
                System.out.println("The name of your " +( i + 1) + " child is " + name_children + " and was born in the year of " + (2020 -  age_children) + " ");
                
                 }
                
            }
            
            
        
        
        }
            
        
        
   
    
    
}
    
    
    public static void favouriteColour()  {
    // initialize String and ask the user the favorite colour
    
    Scanner sc =  new Scanner (System.in);
    String colour = "";
    
        System.out.print("What is your favourite colour: ");
        colour = sc.next();
        System.out.println("Your favourite colour is : " + colour);
        
}
    
    
}