import java.util.ArrayList;

public class BinarySearch {
    public  static void main(String args[])
    {
        ArrayList<Integer> br = new ArrayList<>();
        br.add(2);
        br.add(4);
        br.add(12);
        br.add(87);
        br.add(98);
        serachBybinary(br,87);
    }

    private static int serachBybinary(ArrayList<Integer> br, int i) {
        int start=0;
        int end=br.size();
        while (start<end)
        {
             int midPoint=(start+end)/2;
            if(i==br.get(midPoint))
            {
                System.out.println(midPoint);
                return midPoint;
            }
            else if(br.get(midPoint)<i)
            {
                start=midPoint+1;
            }
            else{
                end=midPoint;
            }
        }
        return -1;
    }

}
