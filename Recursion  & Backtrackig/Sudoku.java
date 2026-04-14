public class Sudoku {
    public static void main(String[] args) {
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        if (sudoku(board, 0, 0)) {
            System.out.println("sol exists");
            printBoard(board);
        } else {
            System.out.println("No solution exists");
        }
    }

    public static boolean sudoku(int[][] board, int row, int col){
        //base case
        if(row==9){
            return true;
        }
        //recursion 
        int nextrow=row, nextcol= col+1;
        if(col+1==9){
            nextrow=row+1;
            nextcol=0;
        }
        if(board[row][col] != 0){
            return sudoku(board, nextrow, nextcol);
        }
        for(int digit=1;digit<=9;digit++){
            if(isSafe(board, row, col,digit)){
                board [row][col]=digit;
                if(sudoku(board,nextrow, nextcol)){
                    return true;
                }
                board[row][col]=0;//backtrack
            }
        }
        return false;
    }
    
    public static boolean isSafe(int board [][],int row, int col, int digit){
        //for colume
        for(int i=0;i<9;i++){
            if(board[i][col]==digit){
                return false;
            }
        }
        //for row
        for(int j=0;j<9;j++){
            if(board[row][j]==digit){
                return false;
            }
        }

    //for sub-grid searching
        int sr=(row/3)*3;//starting row
        int sc=(col/3)*3;//starting col

        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[row][col]==digit){
                    return false;
                }
            }
        }
      
    return true;
    }

    public static void printBoard(int board [][]){
        System.out.println("{");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("}");
    }
}
