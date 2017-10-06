
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Demonstrate how to use the Robots
 * @author lamon
 */
public class RobotExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new city called kicthener
        City kitchener = new City();
        
        // create a robot
        Robot karel = new Robot(kitchener, 3, 2, Direction.EAST);
        // create a second robot named tina
        Robot tina = new Robot(kitchener, 3, 5, Direction.WEST);
        
        // create a wall and a thing to interact with
        new Wall(kitchener, 3, 2, Direction.NORTH);
        new Thing(kitchener, 3, 3);
        
        // place a label on tina
        tina.setLabel("Tina");
        
        // move to thing
        karel.move();
        // have karel pick up the thing
        karel.pickThing();
        
        
        // have karel turn
        karel.turnLeft();
        
        // get karel to move
        karel.move();
        karel.move();
        
        // make karel drop the thing he's carrying
        karel.putThing();
        
        // change tina's colour to magenta
        tina.setColor(Color.MAGENTA);
        
        
        
    }
    
}
