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

}
