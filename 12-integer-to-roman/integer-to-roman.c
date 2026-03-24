char* intToRoman(int num) {
   static const char* roman_symbols[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    static const int values[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    
    static char result[20];
    result[0] = '\0'; 

    for (int i = 0; i < 13; ++i) {
        while (num >= values[i]) {
            num =num - values[i]; 
            strcat(result, roman_symbols[i]);
            //The function returns a pointer to the destination string
        }
    }
    
    return result; 
}