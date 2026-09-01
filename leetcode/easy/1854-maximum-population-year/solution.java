class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] population = new int[101];

        // Record changes in population
        for (int[] log : logs) {
            int birth = log[0];
            int death = log[1];

            population[birth - 1950]++;
            population[death - 1950]--;
        }

        int maxPopulation = 0;
        int currentPopulation = 0;
        int earliestYear = 1950;

        // Calculate population year by year
        for (int i = 0; i < 101; i++) {
            currentPopulation += population[i];

            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                earliestYear = 1950 + i;
            }
        }

        return earliestYear;
    }
}