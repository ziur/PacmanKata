package test.java;

import pacman.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GridTest {

    @Test
    public void TestPacmanExists()
    {
        Grid grid = new Grid();
        Pacman pacman = grid.getPacman();
        assertNotNull(pacman);
    }

    @Test
    public void TestContainsDots(){
        Grid grid = new Grid();
        assert(grid.HasDots());
    }

    @Test
    public void TestMovePacman() {
        Grid grid = new Grid();
        Pacman pacman = grid.getPacman();
        grid.movePacman();
        Object pacmanMoved = grid.getElement(0, 1);
        assertEquals(pacman, pacmanMoved);
    }

    @Test
    public void TestGetDotPosition() {
        Grid grid = new Grid();
        Pacman pacman = grid.getPacman();
        Object dot = grid.getElement(0, 1);
        assertNotEquals(pacman, dot);
    }

    @Test
    public void TestMovePacmanAndEatDot() {
        Grid grid = new Grid();
        Pacman pacman = grid.getPacman();
        Element dot = grid.getElement(0, 1);

        grid.movePacman();
        Object pacmanMoved = grid.getElement(0, 1);
        Element dot = grid.getElement(0, 2);
    }
}
