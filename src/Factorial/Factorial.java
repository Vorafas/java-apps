package Factorial;

class Factorial {

    int factR(int n) {
        if (n == 1) {
            return 1;
        }
        int result = factR(n - 1) * n;
        return result;
    }

    int factI(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
