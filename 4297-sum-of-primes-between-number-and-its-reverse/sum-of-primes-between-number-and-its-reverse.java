class Solution { 
    int reverse(int num) { 
        long reversed = 0; 
        while (num != 0) { 
            int digit = num % 10; 
            reversed = reversed * 10 + digit; 
            num /= 10; 
        } 
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0; 
        }
        return (int) reversed; 
    } 

    boolean isPrime(int n) { 
        if (n <= 1) return false; 
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        
        for (int i = 5; i * i <= n; i += 6) { 
            if (n % i == 0 || n % (i + 2) == 0) { 
                return false; 
            } 
        } 
        return true; 
    } 

    public int sumOfPrimesInRange(int n) { 
        int j = reverse(n); 
        
        int start = Math.min(n, j);
        int end = Math.max(n, j);
        
        int sum = 0; 
        for (int i = start; i <= end; i++) { 
            if (isPrime(i)) {
                sum += i; 
            }
        } 
        return sum; 
    } 
}
