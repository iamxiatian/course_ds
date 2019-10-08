package ds.stack;

public class Cell {
    public static int INIT = 0;
    public static int UP = 1;
    public static int RIGHT = 2;
    public static int DOWN = 3;
    public static int LEFT = 4;

    public static int WALL = 1;
    public static int WAY = 0;

    public int row, col, value;

    public int direction = INIT;

    public Cell(int row, int col, int value) {
        this.row = row;
        this.col = col;
        this.value = value;
    }

    public boolean isWall() {
        return this.value == 1;
    }

    public boolean hasNextDirection() {
        return direction != LEFT;
    }

    public int nextDirection() {
        return direction + 1;
    }

    public boolean visited = false;

    public boolean canWalk() {
        return (!isWall()) && !visited;
    }

    public boolean onPath = false;

    public String symbol() {
        if (value == WALL) {
            return "▧";
        } else if (!onPath) {
            return "▢";
        } else if(direction==UP) {
            return Symbol.UP;
        }else if(direction==RIGHT) {
            return Symbol.RIGHT;
        }else if(direction==DOWN) {
            return Symbol.DOWN;
        }else if(direction==LEFT) {
            return Symbol.LEFT;
        } else {
            return "☆"; //目标位置
        }
    }

}
