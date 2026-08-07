class Solution {
    public int largestAltitude(int[] gain) {
        int alt =0;
        int mx =0;
        for(int x : gain){
            alt+=x;
            mx = Math.max(alt,mx);
        }
        return mx;
    }
}