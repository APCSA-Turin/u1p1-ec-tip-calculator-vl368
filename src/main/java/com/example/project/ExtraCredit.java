package com.example.project;
import java.util.Scanner;


public class ExtraCredit {


    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();

        //DO NOT DELETE ANY OF THE CODE BELOW      
        Scanner scan = new Scanner(System.in);
        
        if (items.equals("")){
            String userInput = ""; // stores current user input

            while(!userInput.equals("-1")){
                System.out.println("Enter an item name or type '-1' to finish:"); // prints the input statement
                userInput = scan.nextLine(); // scans for userinput
                if (!userInput.equals("-1")){    
                    items += userInput + "\n"; // stores the user input + a new line token for formatting
                }
            }
        }

        double totalTip = cost * percent * 0.01; // calculates total tip
        double totalBill = totalTip + cost; // calculates totalBill by adding cost and tip
        double perPersonCost = (cost * 100 / people ) * .01; // calculates the cost per person by converting cost to whole num to avoid round off errors
        double perPersonTip = (totalTip * 100 / people) * .01; // calculates by converting totaTip to int and dividing by people
        double perPersonTotal = (perPersonCost + perPersonTip); // adds the perPersonCost and perPersonTip for total paid
                       
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + String.format("%.2f", cost) + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" + String.format("%.2f", totalTip) + "\n");
        result.append("Total Bill with tip: $" + String.format("%.2f", totalBill)+ "\n");
        result.append("Per person cost before tip: $" + String.format("%.2f", perPersonCost)+ "\n");
        result.append("Tip per person: $" + String.format("%.2f", perPersonTip)+ "\n");
        result.append("Total cost per person: $" + String.format("%.2f", perPersonTotal)+ "\n");
        result.append("-------------------------------\n");
        result.append("Items ordered:\n");
        result.append(items);

        scan.close();
        return result.toString();       
    }
                                   
    public static void main(String[] args) {
        int people = 6;
        int percent = 25;
        double cost = 52.27;
        String items ="";

        //Your scanner object and while loop should go here
                             
        System.out.println(calculateTip(people,percent,cost,items));
    }
}
