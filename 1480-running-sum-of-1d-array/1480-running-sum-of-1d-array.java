class Solution {
    public int[] runningSum(int[] nums) {
        int[] pfArr = new int[nums.length];
        pfArr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pfArr[i]=pfArr[i-1] + nums[i];
}
   return pfArr;
    }
}