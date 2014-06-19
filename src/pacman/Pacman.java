package pacman;

public class Pacman {

    public enum Direction { Left, Right, Up, Down };

    private Direction currentDirection;

    public void turnLeft() {
        currentDirection = Direction.Left;
    }

    public void turnRight() {
        currentDirection = Direction.Right;
    }

    public void goUp() {
        currentDirection = Direction.Up;
    }

    public void goDown() {
        currentDirection = Direction.Down;
    }

    public Direction getDirection() {
        return currentDirection;
    }

}
