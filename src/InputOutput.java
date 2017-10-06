
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lamon
 */
public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        // say hello
//        System.out.println("Hello world!");
//        System.out.print("Hello");
//        System.out.print("World \n");
        // Create a Scanner for input
        Scanner input = new Scanner(System.in);

        // get name from the user
        // tell the user what they need to do
        System.out.println("Please enter your name:");
        // use the scanner to input the name
        String firstName = input.nextLine();

        // output the variable to the screen
        System.out.println("Hello " + firstName);

        // ask the person the year they were born
        System.out.println("Please enter the year you were born:");
        // get the year
        int birthYear = input.nextInt();

        // basic error checking
        while (birthYear > 2017) {
            System.out.println("I don't think so....Try again...");
            birthYear = input.nextInt();
        }

        // calculate age
        int age = 2017 - birthYear;

        System.out.println("You are " + age + " years old");

        // for loop to count down from 10
        for (int count = age; count > 0; count = count - 1) {
            // output the value in variable i
            System.out.println(count);

            Thread.sleep(500);

        }
    }

}
