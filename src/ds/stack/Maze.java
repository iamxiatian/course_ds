package ds.stack;

import java.util.Stack;

public class Maze {
    static int[][] data = new int[][]{
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 1, 0, 0, 0, 1, 0, 1},
            {1, 0, 0, 1, 0, 0, 0, 1, 0, 1},
            {1, 0, 0, 0, 0, 1, 1, 0, 0, 1},
            {1, 0, 1, 1, 1, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 1, 0, 0, 0, 0, 1},
            {1, 0, 1, 0, 0, 0, 1, 0, 0, 1},
            {1, 0, 1, 1, 1, 0, 1, 1, 0, 1},
            {1, 1, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
    };

    static Cell[][] maze = transform();

    static Cell[][] transform() {
        Cell[][] maze = new Cell[data.length][];
        for (int row = 0; row < data.length; row++) {
            maze[row] = new Cell[data[row].length];
            for (int col = 0; col < data[row].length; col++) {
                maze[row][col] = new Cell(row, col, data[row][col]);
            }
        }

        return maze;
    }

    static Cell walkNext(Cell cell) {
        Cell nextCell = null;
        if (cell.direction == Cell.UP) {
            nextCell = maze[cell.row - 1][cell.col];
        } else if (cell.direction == Cell.RIGHT) {
            nextCell = maze[cell.row][cell.col + 1];
        } else if (cell.direction == Cell.DOWN) {
            nextCell = maze[cell.row + 1][cell.col];
        } else if (cell.direction == Cell.LEFT) {
            nextCell = maze[cell.row][cell.col - 1];
        }

        return nextCell;
    }

    static void markPath(Stack<Cell> stack) {
        while (!stack.isEmpty()) {
            Cell cell = stack.pop();
            cell.onPath = true;
        }
    }

    static void find() {
        Stack<Cell> stack = new Stack<>();
        Cell start = maze[1][1];
        start.visited = true;
        stack.push(start);

        while (!stack.isEmpty()) {
            Cell cell = stack.peek();

            if (cell.hasNextDirection()) {
                cell.direction = cell.nextDirection();

                Cell neighbor = walkNext(cell);
                if (neighbor.canWalk()) {
                    stack.push(neighbor);
                    neighbor.visited = true;

                    if (neighbor.row == 8 && neighbor.col == 8) {
                        System.out.println("OK");
                        //标记path
                        markPath(stack);
                        return;
                    }
                }
            } else {
                stack.pop(); //该元素无路可达，弹出
            }
        }
    }

    static void show() {
        for (int row = 0; row < maze.length; row++) {
            for (int col = 0; col < maze[row].length; col++) {
                Cell cell = maze[row][col];
                System.out.print(cell.symbol());
//                if (data[row][col] == 0)
//                    System.out.print("▢");
//                else
//                    System.out.print("▧");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        find();
        show();
    }
}
