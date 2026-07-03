class Solution 
{
    int reverse(int num)
    {
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            
            reversed = reversed * 10 + digit;
            
            num /= 10;
        }
    return reversed;
    }

  boolean isPrime(int n) {
    // 1 and negative numbers are not prime
    if (n <= 1) {
        return false;
    }
    
    // Check for factors up to the square root of n
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            return false; // Found a factor, not prime
        }
    }
    
    return true; // No factors found, it is prime
}

    public int sumOfPrimesInRange(int n) {
    int sum=0;
    int j=reverse(n);
    int start = Math.min(n, j);
    int end = Math.max(n, j);
    for(int i=start; i<=end; i++)
    {
        if(isPrime(i))
            sum+=i;
    }
    return sum;    
    }
}