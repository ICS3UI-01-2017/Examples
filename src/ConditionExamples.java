
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lamon
 */
public class ConditionExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();
        // put a robot in the city
        Robot karel = new Robot(kw, 2, 1, Direction.EAST);
        // put a wall up
        new Wall(kw, 2, 5, Direction.EAST);
        new Thing(kw, 2, 4);
        
        
        // check if front is clear
        if (karel.frontIsClear()) {
            // move forward
            karel.move();

        } else {
            // if front is blocked, turn
            karel.turnLeft();
        }
        
        
        // until robot hits wall
        while(karel.frontIsClear()){
            // if there is something to pick up
            if(karel.canPickThing()){
                // pick it up
                karel.pickThing();
            }
            // move forward
            karel.move();
        }
        
        // turn the robot away from the wall
        karel.turnLeft();
        

    }
}


