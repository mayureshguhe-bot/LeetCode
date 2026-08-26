class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] population = new int[101];
        for (int i = 0; i < logs.length; i++) {
            int birth = logs[i][0];
            int death = logs[i][1];

            for (int year = birth; year < death; year++) {
                population[year - 1950]++;
            }

        }

        int maxP = 0;
        int answer = 0;
        for (int year = 1950; year < 2050; year++) {
            if (population[year - 1950] > maxP) {
                maxP = population[year-1950];
                answer = year;
            }

        }
        return answer;
    }
}