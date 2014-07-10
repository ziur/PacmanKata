package test.java;

import pacman.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alejandro^ruiz on 5/22/14.
 */
public class PacmanTest {

    @Test
    public void testTurnLeft(){
        Pacman pacman = new Pacman();
        pacman.turnLeft();
        assertEquals(Pacman.Direction.Left, pacman.getDirection());
    }

    @Test
    public void testTurnRight()
    {
        Pacman pacman = new Pacman();
        pacman.turnRight();
        assertEquals(Pacman.Direction.Right, pacman.getDirection());
    }

    @Test
    public void testGoUp()
    {
        Pacman pacman = new Pacman();
        pacman.goUp();
        assertEquals(Pacman.Direction.Up, pacman.getDirection());
    }

    @Test
    public void testGoDown()
    {
        Pacman pacman = new Pacman();
        pacman.goDown();
        assertEquals(Pacman.Direction.Down, pacman.getDirection());
    }

    @Test
    public void testEatADot()
    {
        Pacman pacman = new Pacman();
        Element dot = new Dot();
        assertEquals(true, pacman.eat(dot));
    }
    @Test
    public void testEatAWall()
    {
        Pacman pacman = new Pacman();
        Element wall = new Wall();
        assertEquals(false, pacman.eat(wall));
    }
}
