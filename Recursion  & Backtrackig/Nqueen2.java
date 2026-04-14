//find if solution possible, if possible print any one solution
public class Nqueen2 {

    public static boolean nQueens(char board[][], int row){
        if(row==board.length){
            printBoard(board);
            return true;
        }
        for(int j=0;j<board.length;j++){
           if(isSafe(board,row,j)){
            board[row][j]='Q';
            if(nQueens(board,row+1)){
                return true;//stack full zalyavrch backtraking walii step yate.once this stack is full with the possible soln. we will return directly without performing the bcktracking step.
            }
            board[row][j]='.';//backtracking
        }
    }
    return false;
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
    public static void printBoard(char board[][]){
        System.out.println("---------chessBoard------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }

        if(nQueens(board,0)){
            System.out.println("solution exists");
        }else{
            System.out.println("solution is not possible");
        }

        
    }
}


//O(n!)-> 1 queen ko place krne ko n time, 2nd queen ko place krneka n-1 time, 3rd queen ko place krneka n-3 time

//recurence relation=O(n)*O(n-1) + isSafe