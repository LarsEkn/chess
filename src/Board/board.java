package Board;

import java.util.*;
import java.sql.Array;

public class board {
    public static void placeWhite(char[][] array){
        char[] pieces = {'T', 'H', 'S', 'D', 'K', 'P'};
        int leftSide = 0;
        int rightSide = 7;

        for (char i : pieces) {
            if(i != 'D' && i != 'K' && i != 'P') {
                array[7][leftSide] = i;
                leftSide++;

                array[7][rightSide] = i;
                rightSide--;
            }
            else if (i == 'D'){
                array[7][leftSide] = i;
            }
            else if (i == 'K'){
                array[7][rightSide] = i;
            }
            else if (i == 'P'){
                for (int k = 0; k<8; k++){
                    array[6][k] = i;
                }
            }
        }
    }

    public static void placeBlack(char[][] array){
        char[] pieces = {'T', 'H', 'S', 'D', 'K', 'P'};
        int leftSide = 0;
        int rightSide = 7;

        for (char i : pieces) {
            if(i != 'D' && i != 'K' && i != 'P') {
                array[0][leftSide] = i;
                leftSide++;

                array[0][rightSide] = i;
                rightSide--;
            }
            else if (i == 'D'){
                array[0][leftSide] = i;
            }
            else if (i == 'K'){
                array[0][rightSide] = i;
            }
            else if (i == 'P'){
                for (int k = 0; k<8; k++){
                    array[1][k] = i;
                }
            }
        }
    }


    public static void main(String[] args) {
        char[][] board = new char[8][8];

        for (int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                board[i][j] = '*';
            }
        }
        placeWhite(board);
        placeBlack(board);

        for(int m = 0; m<8; m++){
            System.out.println(Arrays.toString(board[m]));
        }
    }


}
