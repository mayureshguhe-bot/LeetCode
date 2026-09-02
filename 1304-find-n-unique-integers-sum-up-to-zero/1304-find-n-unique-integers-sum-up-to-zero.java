class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int start = 0;
        int end = arr.length-1;
        int i=1;
        while(start<end){
            arr[start]=i;
            arr[end]=-i;

            i++;
            start++;
            end--;
        }
        return arr;
    }
}