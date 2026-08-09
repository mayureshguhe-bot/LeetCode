class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

// For flipping(reversing) the image.
        for(int i =0;i<image.length;i++){
            int start =0;
            int end = image.length-1;
            while(start<=end){
                int temp = image[i][start]^1;
                image[i][start]=image[i][end]^1;
                image[i][end]=temp;

                start++;
                end--;
            }}

// Custom logic for converting 0->1 and 1->0 or just XOR(^) it as above.
            // for(int i =0;i<image.length;i++){
            //     for(int j=0;j<image.length;j++){
            //         if(image[i][j]==1){
            //             image[i][j]=0;
            //         }
            //         else if(image[i][j]==0){
            //             image[i][j]=1;
            //         }
            //     }
            // }
                return image;
    
}}