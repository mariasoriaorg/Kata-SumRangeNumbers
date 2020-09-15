public class SumRangeNumbers {

    public static int getSumRangeNumbers(int a, int b)
    {
        int sum = 0;

        if (a == b) return a;

        int first = a < b? a : b;
        int second = a > b? a : b;

        for (int i = first; i <= second; i++) {
            sum += i;
        }
        return sum;
    }

}
