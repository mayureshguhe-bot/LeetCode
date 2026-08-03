class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j && nums[j] < nums[i]){
                    arr[i]=arr[i]+1;
                }
            }
        }
        return arr;
    }
}