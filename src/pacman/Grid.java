package pacman;

import java.util.HashMap;

public class Grid {

    //private HashMap
    private Pacman pacman;

    public Grid(){
        pacman = new Pacman();
    }

    public Pacman getPacman() {
        return pacman;
    }

    public boolean HasDots() {
        return true;
    }

    public void movePacman() {

    }

    public Object getElement(int i, int i1) {
        return pacman;
    }
}
