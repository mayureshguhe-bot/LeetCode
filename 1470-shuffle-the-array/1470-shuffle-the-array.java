class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];

        int x=0;
        for(int i =0;i<arr.length;i+=2){
            arr[i] = nums[x];
            arr[i+1]= nums[x+n];
            x++;
        }
        return arr;
    }
}