package pacman;

public class Grid {

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

}
