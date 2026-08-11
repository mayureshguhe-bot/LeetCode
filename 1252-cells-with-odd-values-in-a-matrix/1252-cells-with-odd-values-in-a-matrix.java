class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        for(int[] index : indices){
            int r = index[0];
            int c = index[1];
    for(int j=0;j<n;j++){
        arr[r][j]+=1;
    }
        for(int i=0;i<m;i++){
        arr[i][c]+=1;
    }
}
    int count=0;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]%2 != 0){
                count++;
            }
        }
    }
        return count;
    }
}