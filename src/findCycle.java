import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class findCycle {
public static void main(String args[])
{
    int data[]={1,2,0};
    int[] counters = new int[data.length];
    int index = 0;
    int count = 0;
    while(counters[index] == 0) {
        counters[index] = count++;
        index = data[index];
    }
    System.out.println(count - counters[index]);
    List<Integer> val = new LinkedList<>();
    val.add(1);
    //return count - counters[index];
}


}
