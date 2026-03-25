char* multiply(char* num1, char* num2) {
    int len1 = strlen(num1);
    int len2 = strlen(num2);

    int result[2000] = {0};  // enough space

    // Multiply digits (right to left)
    for (int i = len1 - 1; i >= 0; i--) {
        for (int j = len2 - 1; j >= 0; j--) {
            int mul = (num1[i] - '0') * (num2[j] - '0');

            int pos1 = i + j;
            int pos2 = i + j + 1;
            int sum = mul + result[pos2];
            result[pos2] = sum % 10;      // store last digit
            result[pos1] += sum / 10;     // carry
        }
    }

    // Convert to string
    char* ans = (char*)malloc(2000);
    int k = 0;
    int i = 0;

    // Skip leading zeros
    while (i < len1 + len2 && result[i] == 0) {
        i++;
    }

    // If result is 0
    if (i == len1 + len2) {
        ans[0] = '0';
        ans[1] = '\0';
        return ans;
    }

    // Store digits in string
    while (i < len1 + len2) {
        ans[k++] = result[i++] + '0';
    }
    ans[k] = '\0';

    return ans;
}
