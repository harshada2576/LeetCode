class Solution {

    int frequency(int digit, int n) {
        int f = 0, r;
        while (n > 0) {
            r = n % 10;
            if (digit == r)
                f++;
            n /= 10;
        }
        return f;
    }

    public static int[] getUniqueDigitsArray(int number) {
        boolean[] seen = new boolean[10];
        int count = 0;
        int temp = Math.abs(number);

        if (temp == 0) return new int[]{0};

        while (temp > 0) {
            int digit = temp % 10;
            if (!seen[digit]) {
                seen[digit] = true;
                count++;
            }
            temp /= 10;
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < 10; i++) {
            if (seen[i]) result[index++] = i;
        }

        return result;
    }

    public int getLeastFrequentDigit(int n) {

        int f;
        int min = Integer.MAX_VALUE;
        int ans = -1;

        int[] myDigits = getUniqueDigitsArray(n);

        for(int i = 0; i < myDigits.length; i++)
        {
            f = frequency(myDigits[i], n);

            if(f < min)
            {
                min = f;
                ans = myDigits[i];
            }
        }

        return ans;
    }
}