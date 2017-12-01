
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
public class MethodsExample {

    // void method - perform an action
    // does not return an answer
    // sometimes called a procedure
    // inside of round brackets 
    //      - extra variables needed to run
    public void sayHello(String name){
        System.out.println("Hello " + name);
    }
    
    // double return type - needs to send a double as an answer
    // sometimes called a function
    // use return to send the answer back
    public double areaOfRect(double length, double width){
        // calculate area
        double answer = length * width;
        // send back the answer
        return answer;
    }
    
    // this will not change the original variable
    // create a function type if you want to return a value changed
    public void addFive(int a){
        a = a + 5;
    }
    
   
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an object to run my methods
        MethodsExample test = new MethodsExample();
        
        // create a scanner
        Scanner in = new Scanner(System.in);
        
        // ask user for their name
        System.out.println("Please enter your name");
        // store their name
        String someName = in.nextLine();
        //say hello to the user
        test.sayHello(someName);
        
        // using my function
        System.out.println("Please enter the length and width of a rectangle");
        // store the 2 values
        double a = in.nextDouble();
        double b = in.nextDouble();
        
        // calculate area
        double area = test.areaOfRect(a,b);
        // let the user know the answer
        System.out.println("The area is " + area);
        
        // test with variables
        int num = 10;
        test.addFive(num);
        System.out.println("Num is " + num);
        
        
    }
    
}
