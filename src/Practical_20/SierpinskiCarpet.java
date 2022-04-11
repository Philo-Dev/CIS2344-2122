package Practical_20;

import java.util.ArrayList;
import java.util.Arrays;

public class SierpinskiCarpet {

    static int size = 27; //Change to 3, 9, 27 or 81
    static int subArraySize = size/3;
    static char[][] board = new char[size][size];
    static int counter = 0;

    /**
     * A function that recursively removes '*'
     * and replaces it with ' ' in the shape of the sierpinski carpet
     * for the board array.
     */
    public static void carpetBuilder() {
        //Creates the largest square in the centre of the carpet
        for (int i = 0; i < subArraySize; i++) {
            for (int j = 0; j < subArraySize; j++) {
                board[i+subArraySize][j+subArraySize] = ' ';
            }
        }

        //Creates the second-largest level of squares around the centre
        for (int i = 0; i < subArraySize/3; i++) {
            for (int j = 0; j < subArraySize/3; j++) {
                //Top Left
                board[i+subArraySize/3][j+subArraySize/3] = ' ';
                //Bottom Right
                board[size-subArraySize/3-i-1][size-subArraySize/3-j-1] = ' ';
                //Top Right
                board[i+subArraySize/3][size-subArraySize/3-j-1] = ' ';
                //Bottom Left
                board[size-subArraySize/3-i-1][j+subArraySize/3] = ' ';

                //Left
                board[i+size/2][j+subArraySize/3] = ' ';
                //Right
                board[i+size/2][size-subArraySize/3-j-1] = ' ';
                //Top
                board[i+subArraySize/3][j+size/2] = ' ';
                //Bottom
                board[size-subArraySize/3-i-1][j+size/2] = ' ';
            }
        }

        //Attempts to create the third level of squares.
        for (int i = 0; i < subArraySize/9; i++) {
            for (int j = 0; j < subArraySize/9; j++) {
                //Top Left
                board[i+subArraySize/9][j+subArraySize/9] = ' ';
                //Bottom Right
                board[size-subArraySize/9-i-1][size-subArraySize/9-j-1] = ' ';
                //Top Right
                board[i+subArraySize/9][size-subArraySize/9-j-1] = ' ';
                //Bottom Left
                board[size-subArraySize/9-i-1][j+subArraySize/9] = ' ';

                //Left
                board[i+size/2][j+subArraySize/9] = ' ';
                //Right
                board[i+size/2][size-subArraySize/9-j-1] = ' ';
                //Top
                board[i+subArraySize/9][j+size/2] = ' ';
                //Bottom
                board[size-subArraySize/9-i-1][j+size/2] = ' ';
            }
        }

        board[size/2][size/2] = ' ';
    }

    /**
     * A recursive function that prints a single row
     * of a carpet on a (n x n) board
     * Reference: Ilias Tachmazidis - Sierpinski Triangle (Sept 2021)
     *
     * @param row the row to be updated
     * @param column the column to be updated
     */
    public static void carpetUpdateRow(int row,int column) {
        if (column < 1) {
            return;
        }

        carpetBuilder();
        carpetUpdateRow(row, column - 1);
    }


    /**
     * A recursive function that prints a carpet
     * on a (n x n) board
     * Reference: adapted from Ilias Tachmazidis - Sierpinski Triangle (Sept 2021)
     *
     * @param n the dimension size of the array
     */
    public static void carpet(int n) {
        if (n < 1) { // base case
            return;
        }

        carpetUpdateRow(n,n);

        carpet(n - 1); // recursive case, progress (through rows)
    }

    public static void main(String[] args) {
        // Initialize the board with character '*'
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '*';
            }
        }

        carpet(size);

        // Print final board
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
