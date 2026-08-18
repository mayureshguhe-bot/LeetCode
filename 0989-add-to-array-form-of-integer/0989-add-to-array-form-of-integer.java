class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int i = num.length - 1;
        while (i >= 0 || k > 0) {
            int digit = k % 10;
            k /= 10;
            if (i >= 0) {
                int sum = digit + num[i];
                num[i] = sum % 10;
                k = k + sum / 10;

                i--;
            } else {
                list.add(0, digit);
            }
        }
        for (int j = 0; j < num.length; j++) {
            list.add(num[j]);
        }
        return list;
    }
}