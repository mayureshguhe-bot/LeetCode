import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        Boolean[] arr = new Boolean[candies.length];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(candies[i]+extraCandies >= max){
                arr[i]=true;
            }
            else{
                arr[i]=false;
            }
        }
        return Arrays.asList(arr);        
    }
}