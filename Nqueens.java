public class Nqueens {


    //find All possible placings and print them.
    public static void PlaceNqueens(char board[][],int row){
        if(row == board.length){
            printBoard(board);
            count++;
            System.out.println();
            return;
        }

        for(int j = 0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                PlaceNqueens(board, row+1);
                board[row][j] = 'X';
            }
        }
    }

    public static boolean isSafe(char board[][],int row,int col){
        for(int i = row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        for(int i = row-1,j = col-1;i>=0 && j >=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        for(int i = row-1,j = col + 1;i>=0 && j<board.length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static void printBoard(char board[][]){
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board.length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }


    //To count number of ways possible.
    static int count = 0;

    //Print only one possible solution
    public static boolean PlaceNqueens_OneSol(char board[][],int row){
        //base case 
        if(row == board.length){
            printBoard(board);
            return true;
        }
        //main logic
        for(int j = 0;j< board.length;j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                if(PlaceNqueens_OneSol(board, row+1)){
                    return true;
                }

                board[row][j] = 'X';
            }
        }
        return false;
    }
    public static void main(String args[]){
        char matrix[][] = new char[5][5];
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix.length;j++){
                matrix[i][j] = 'X';
            }
        }
        PlaceNqueens_OneSol(matrix,0);
    }
}
