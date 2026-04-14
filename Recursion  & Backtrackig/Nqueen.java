//print all ways

import java.util.*;
public class Nqueen {

    public static List<List<String>> nQueens(char board[][], int row,List<List<String>> result,int n){
        if(row==board.length){
            //printBoard(board);
            result.add(construct(board,n)); 
            return result;
        }
        for(int j=0;j<board.length;j++){
           if(isSafe(board,row,j)){
            board[row][j]='Q';
            nQueens(board,row+1,result,n);
            board[row][j]='.';
        }
    }
    return result;
}
    public static boolean isSafe(char board[][],int row, int col){
        //vertically upward
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //digionally left
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diagonally right
        for(int i=row-1,j=col+1;i>=0 && j<=board.length-1;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    // public static void printBoard(char board[][]){
    //     System.out.println("---------chessBoard------------");
    //     for(int i=0;i<board.length;i++){
    //         for(int j=0;j<board.length;j++){
    //             System.out.print(board[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
        
    // }
    public static List<String> construct(char[][] board, int n) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(new String(board[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<String>> result=new ArrayList<>();
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }

        nQueens(board,0,result,4);
        
        
    }
}


//O(n!)-> 1 queen ko place krne ko n time, 2nd queen ko place krneka n-1 time, 3rd queen ko place krneka n-3 time

//recurence relation=O(n)*O(n-1) + isSafe