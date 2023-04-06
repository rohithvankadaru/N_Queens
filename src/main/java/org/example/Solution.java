package org.example;

public class Solution {

    static int count = 0;
    public void N_Queens(int[][] chess, int row, int n){
        if(row == n){
            count++;
            printBoard(chess);
            System.out.println();
            System.out.println();
            return;
        }
        for(int col = 0; col < n; col++){
            if(isSafe(row, col, chess, n)){
                chess[row][col] = 1;
                N_Queens(chess, row+1, n);
                chess[row][col] = 0;
            }
        }
    }

    private boolean isSafe(int row, int col, int[][] chess, int n) {
        //checking coloumn
        for(int temp = 0; temp < row; temp++){
            if(chess[temp][col] == 1) return false;
        }
        //check diognally
        //check upto top right
        int i = row;
        int j = col;
        while(i >= 0 && j < n){
            if(chess[i][j] == 1) return false;
            i--;
            j++;
        }
        //check upto top left
        i = row-1;
        j = col-1;
        while (i >= 0 && j >= 0){
           if(chess[i][j] == 1) return false;
           i--;
           j--;
        }
        return true;
    }

    private void printBoard(int[][] chess) {
        for(int[] arr : chess){
            for(int ele : arr){
               if(ele == 1) System.out.print("Q ");
               else System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
