public class BubbleSort {
    public static void main(String args[])
    {
        int[] arr={1,20,35,-11,20,56,3};
        for(int lastI=arr.length-1;lastI>0;lastI--)
        {
            for(int i=0;i<lastI;i++)
            {
                if(arr[i]>arr[i+1])
                    swap(arr,i,i+1);
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    private static void swap(int[] arr, int i, int j ){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}
