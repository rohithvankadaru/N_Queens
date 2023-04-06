package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] chess = new int[n][n];
        for(int[] arr : chess){
            for(int ele : arr){
                ele = sc.nextInt();
            }
        }
        System.out.println();
        s.N_Queens(chess, 0, n);
        System.out.println(Solution.count);
    }
}