import java.util.Random;
import java.util.Scanner;

public class Game2048 {
    private static final int SIZE = 4;
    private static final int TARGET = 2048;
    private int[][] board = new int[SIZE][SIZE];
    private Random random = new Random();

    public Game2048() {
        addRandomTile();
        addRandomTile();
    }

    private void addRandomTile() {
        int row, col;
        do {
            row = random.nextInt(SIZE);
            col = random.nextInt(SIZE);
        } while (board[row][col] != 0);

        board[row][col] = 2;
    }

    public void drawBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print("+" + "-----");
            }
            System.out.println("+");
            for (int j = 0; j < SIZE; j++) {
                System.out.print("|" + (board[i][j] == 0 ? "     " : String.format("%5d", board[i][j])));
            }
            System.out.println("|");
        }
        for (int j = 0; j < SIZE; j++) {
            System.out.print("+" + "-----");
        }
        System.out.println("+");
    }

    private void moveLeft() {

        // dla  kazdego wiersza
        for (int i = 0; i < SIZE; i++) {
            // przepisz dane w kopii wiersza przenosząc elementy w lewo
            int[] row = new int[SIZE];
            int index = 0;
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] != 0) {
                    row[index++] = board[i][j];
                }
            }
            // jesli sa 2 takie same liczby obok siebie to je dodaj
            for (int j = 0; j < SIZE - 1; j++) {
                if (row[j] == row[j + 1] && row[j] != 0) {
                    row[j] *= 2;
                    row[j + 1] = 0;
                }
            }

            // zwroc wyniki do oryginalnej tabeli
            index = 0;
            for (int j = 0; j < SIZE; j++) {
                if (row[j] != 0) {
                    board[i][index++] = row[j];
                }
            }
            // zerujemy pozostałe elementy
            for(int j=index; j<SIZE; j++){
                board[i][j] = 0;
            }
        }

        if(! isGameOver()) {
            addRandomTile();
        }

    }

//    private boolean hasMovementOccurred(int[] originalRow, int[] newRow) {
//        for (int i = 0; i < SIZE; i++) {
//            if (originalRow[i] != newRow[i]) {
//                return true;
//            }
//        }
//        return false;
//    }

    private void moveRight() {
        rotateBoard();
        rotateBoard();
        moveLeft();
        rotateBoard();
        rotateBoard();
    }

    private void moveUp() {
        rotateBoard();
        rotateBoard();
        rotateBoard();
        moveLeft();
        rotateBoard();
    }

    private void moveDown() {
        rotateBoard();
        moveLeft();
        rotateBoard();
        rotateBoard();
        rotateBoard();
    }

    private void rotateBoard() {
        int[][] newBoard = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                newBoard[j][SIZE - 1 - i] = board[i][j];
            }
        }
        board = newBoard;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            drawBoard();
            System.out.print("Move (g=up, d=down, l=left, p=right): ");
            String move = scanner.nextLine();

            switch (move) {
                case "g":
                    moveUp();
                    break;
                case "d":
                    moveDown();
                    break;
                case "l":
                    moveLeft();
                    break;
                case "p":
                    moveRight();
                    break;
                default:
                    System.out.println("Invalid move. Try again.");
                    continue;
            }

            if (isGameOver()) {
                System.out.println("Game Over!");
                break;
            }
        }
        scanner.close();
    }

    private boolean isGameOver() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
                if (board[i][j] == TARGET) {
                    return true;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Game2048 game = new Game2048();
        game.play();
    }
}
