#include <limits.h>  

int reverse(int x) {
    int r, s = 0;
    while (x != 0) {
        r = x % 10;
        x = x / 10;

        if (s > INT_MAX/10 || (s == INT_MAX/10 && r > 7))
            return 0;
        if (s < INT_MIN/10 || (s == INT_MIN/10 && r < -8)) 
            return 0;

        s = s * 10 + r;
    }
    return s;
}