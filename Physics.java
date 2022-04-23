public class Physics {
    public boolean Space(int n, int x[], int y[], int z[]) {
        if (n <= 0)
            throw new IllegalArgumentException("n must be a positive integer");

        int SumX = 0, SumY = 0, SumZ = 0;

        while (n > 0) {
            SumX = SumX + x[n-1];
            SumY = SumY + y[n-1];
            SumZ = SumZ + z[n-1];
            n--;
        }
        if (SumX == 0 && SumY == 0 && SumZ == 0)
            return true;
        else
            return false;
    }
}
