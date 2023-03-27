public class TrailingZeroes {
    public static void main(String[] args) {
        System.out.println(Zeros(3));
    }

    static int Zeros(int n) {
        int count = 0;
        for (int i = 5; i <= n; i = i * 5) {
            count = count + n / i;
        }
        return count;
    }
}