import java.util.LinkedList;
import java.util.List;

public class FindVal {
    public static void main(String args[])
    {
        int[] states={1,1,1,0,1,1,1,1};
        int days=2;
        cellCompete(states,days);
    }
    public static List<Integer> cellCompete(int[] states, int days) {
        int[] temp = new int[states.length];
        List<Integer> listVal = new LinkedList<>();
        int Start=0;
        int end=0;
        int n=1;
        while (n<=days) {
            for (int element1: states) {
                System.out.println("states" + element1);
            }
            for (int i = 0; i < states.length; i++) {
                System.out.println("i"+i);
                if (i == 0) {
                    if (states[i + 1] == Start) {
                        temp[i] = 0;
                    } else {
                        temp[i] = 1;
                    }
                } else if (i == states.length - 1) {
                    if (states[i - 1] == end) {
                        temp[i] = 0;
                    } else {
                        temp[i] = 1;
                    }
                } else {
                    if (states[i - 1] == states[i + 1]) {
                        temp[i] = 0;
                    } else {
                        temp[i] = 1;
                    }
                }
            }
            System.out.println(temp);
           for (int element: temp) {
                System.out.println("temp" + element);
            }
            states=temp;
          /*  for (int element1: states) {
                System.out.println("temp1" + element1);
            }*/
            System.out.println(n);
            n++;
        }
        for(Integer val:states)
        {
            listVal.add(val);
        }
        System.out.println(listVal);
        return listVal;
    }


}
