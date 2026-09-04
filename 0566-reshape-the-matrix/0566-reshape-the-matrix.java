class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
    if(mat.length*mat[0].length != r*c ){
        return mat;
    }
        int[][] arr = new int[r][c];
        int i=0,j=0;
        for(int[] x: mat){
            for(int y:x){
                arr[i][j]=y;
                j++;

            if(j==c){
                j=0;
                i++;
            }
            }
        }
        return arr;
    }
}