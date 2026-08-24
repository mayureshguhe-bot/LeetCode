class Solution {
    static int[][] transpose(int[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=i+1;j<m[i].length;j++){
                int temp = m[j][i];
                m[j][i] = m[i][j];
                m[i][j] = temp;
            }
        }
        return m;
    }

    static int[][] reverseColoum_wise(int[][] m){
            
        for(int i=0;i<m.length;i++){
        int start=0;
        int end =m.length-1;
        while(start < end){
            int temp=m[i][start];
            m[i][start]=m[i][end];
            m[i][end]=temp;

            start++;
            end--;
        }}

        return m;
    }

    static boolean equal(int[][] a,int[][] b){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]!=b[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int rotation=0;rotation<4;rotation++){
            if(equal(mat,target)){
                return true;
            }
        
        transpose(mat);
        reverseColoum_wise(mat);
        }
        return false;
    }
}