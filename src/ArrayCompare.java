import java.util.Arrays;

public class ArrayCompare {
    public static void main(String args[])
    {
        int A[] = {1, 2, 5, 4, 0};
        int B[] = {2, 4, 5, 0, 1};
        Arrays.sort(A);
        Arrays.sort(B);
        System.out.println(Arrays.equals(A,B));
    }
}
