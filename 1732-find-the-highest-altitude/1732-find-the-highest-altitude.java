class Solution {
    public int largestAltitude(int[] gain) {
        int[] pfArr = new int[gain.length+1];
        pfArr[0]= 0;
        int max = Integer.MIN_VALUE;

        for(int i=1;i<pfArr.length ;i++){
            pfArr[i] = pfArr[i-1] + gain[i-1];
        }

        for(int i=0;i<pfArr.length;i++){
            if(pfArr[i] > max)
                 max = pfArr[i];
        }
        return max;       

    }
}