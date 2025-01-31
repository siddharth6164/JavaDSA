// GFG
// Solve The Sudoku

public class SolveTheSudoku {
    private boolean[][] rows = new boolean[9][10];   
    private boolean[][] cols = new boolean[9][10];  
    private boolean[][] subgrids = new boolean[9][10];  
    
    public boolean solveSudoku(int[][] mat) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (mat[i][j] != 0) {
                    int num = mat[i][j];
                    rows[i][num] = true;
                    cols[j][num] = true;
                    subgrids[(i / 3) * 3 + j / 3][num] = true;
                }
            }
        }
        return solve(mat);
    }

    private boolean solve(int[][] mat) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (mat[i][j] == 0) {
                    for (int num = 1; num <= 9; num++) {
                        if (!rows[i][num] && !cols[j][num] && !subgrids[(i / 3) * 3 + j / 3][num]) {
                            mat[i][j] = num;
                            rows[i][num] = true;
                            cols[j][num] = true;
                            subgrids[(i / 3) * 3 + j / 3][num] = true;

                            if (solve(mat)) {
                                return true;
                            }

                            mat[i][j] = 0;
                            rows[i][num] = false;
                            cols[j][num] = false;
                            subgrids[(i / 3) * 3 + j / 3][num] = false;
                        }
                    }
                    return false;  
                }
            }
        }
        return true;  
    }
    public static void main(String[] args) {
        
    }
}