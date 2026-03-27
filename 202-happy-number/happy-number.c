int loop(int n) {
    int r, s = 0;
    while (n > 0) {
        r = n % 10;
        n = n / 10;
        s = s + (r * r);
    }
    return s;
}
bool isHappy(int n) {
    int sodof = n;
    while (sodof != 1 && sodof != 4) {

        sodof = loop(sodof);
    }
    if (sodof == 1)
        return true;
    else
        return false;
}