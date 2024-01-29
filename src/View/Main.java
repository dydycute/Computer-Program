/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Calculate;

/**
 *
 * @author CHUCDY
 */
public class Main {
     public static void main(String[] args) {
        Main main = new Main();
        main.displayMainMenu();
    }
    
     public void displayMainMenu() { 
        Calculate c = new Calculate();
        Menu<String> mainMenu = new Menu<>("========= Calculator Program =========", new String[]{
            "1. Normal Calculator",
            "2. BMI Calculator",            
            "3. Exit"
        }) {
            @Override
            public void execute(int choice) {
                switch (choice) {
                    case 1 ->                   
                        Calculate.normalCalculator();               
                    case 2 ->
                        Calculate.BMICalculator();                   
                    case 3 ->
                        System.exit(0);
                    default ->
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        };
        
        mainMenu.run();
    }   
}
