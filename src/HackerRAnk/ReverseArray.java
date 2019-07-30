package HackerRAnk;

public class ReverseArray {
    public static void main(String[] args) {
        // Complete the reverseArray function below.
        int[] a = {2, 4, 5, 3};
        reverseArray(a);
    }
       static int[] reverseArray(int[] a) {
           int[] b=new int[a.length];
        for(int i=a.length-1;i>=0;i--){
           b[a.length-(i+1)]=a[i];
        }
        return b;

    }
}
