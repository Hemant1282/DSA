public class SpiralMatrix {

    public static void Spiral_Matrix(int matrix[][]){
        int start_row = 0;
        int start_col = 0;
        int end_row = matrix.length-1;
        int end_col = matrix[0].length-1;
        while(start_row <= end_row && start_col <= end_col){

            //top
            for(int i = start_col;i<=end_col;i++){
                System.out.print(matrix[start_row][i]+" ");
            }

            //right
            for(int i = start_row+1;i<=end_row;i++){
                System.out.print(matrix[i][end_col]+ " ");
            }

            //bottom
            for(int i = end_col-1; i>=start_col;i--){
                System.out.print(matrix[end_col][i]+ " ");
            }

            //left
            for(int i = end_row-1;i>start_row;i--){
                System.out.print(matrix[i][start_col]+ " ");
            }

            start_row++;
            start_col++;
            end_col--;
            end_row--;
        }
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Spiral_Matrix(matrix);
    }
}
