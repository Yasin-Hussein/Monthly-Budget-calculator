/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions;

import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author yasinhussein
 */
public class MyProgram {
    public static void main(String [] args) {
        
        String money = JOptionPane.showInputDialog( null,
                 "Please enter what you have for your monthly budget. ");
        Double budgetDouble = Double.valueOf(money);
        System.out.println(money); 
        

        
        String spend = JOptionPane.showInputDialog( null,
                 "Please enter the amount of money you will spend on rent this month. ");
        System.out.println(spend); 
        
        String groceries = JOptionPane.showInputDialog( null,
                 "Please enter the amount of money you will spend on groceries this month. ");
        System.out.println(groceries); 
        
        String other = JOptionPane.showInputDialog( null,
                 "Please enter the amount of money you will spend on other expenses this month. ");
        System.out.println(other); 
        
        double rent = Double.parseDouble(spend);
        double groceriesP = Double.parseDouble(groceries);
        double otherE = Double.parseDouble(other);
 
        double rentPercentage = (rent/budgetDouble) * 100;
        double groceriesPercentage = (groceriesP/budgetDouble) * 100;
        double otherPercentage = (otherE/budgetDouble) * 100;
        
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat percentageFormat = NumberFormat.getPercentInstance();
        
        String output = 
            "The rent for this month is " + currencyFormat.format(rent) + " which is " + percentageFormat.format(rentPercentage / 100) + " of the budget.\n" +
            "The groceries for this month are " + currencyFormat.format(groceriesP) + " which is " + percentageFormat.format(groceriesPercentage / 100) + " of the budget.\n" +
            "Other expenses for this month are " + currencyFormat.format(otherE) + " which is " + percentageFormat.format(otherPercentage / 100) + " of the budget.";

       JOptionPane.showMessageDialog(null, output);
        
    }   
}
