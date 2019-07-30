package InterviewPackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
 class Memory
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public static void main(String[] args) {

        int deviceCapacity=10;
        List<List<Integer>> foregroundAppList =new ArrayList<>();
      ArrayList<Integer>  f=new ArrayList<>();
      f.add(1);
        f.add(2);
        ArrayList<Integer>  f1=new ArrayList<>();
        f1.add(2);
        f1.add(3);
        ArrayList<Integer>  f2=new ArrayList<>();
        f2.add(3);
        f2.add(4);
        ArrayList<Integer>  f3=new ArrayList<>();
        f3.add(4);
        f3.add(5);
        ArrayList<Integer>  e1=new ArrayList<>();
        e1.add(1);
        e1.add(3);
        ArrayList<Integer>  e=new ArrayList<>();
        e.add(2);
        e.add(5);
        ArrayList<Integer>  x=new ArrayList<>();
        x.add(3);
        x.add(7);
        ArrayList<Integer>  x1=new ArrayList<>();
        x1.add(4);
        x1.add(10);

        foregroundAppList.add(e1);
        foregroundAppList.add(e);
        foregroundAppList.add(x);
        foregroundAppList.add(x1);
        List<List<Integer>> backgroundAppList =new ArrayList<>();;
        backgroundAppList.add(f);
        backgroundAppList.add(f1);
        backgroundAppList.add(f2);
        backgroundAppList.add(f3);
        optimalUtilization(deviceCapacity,foregroundAppList,backgroundAppList);
    }
    static void optimalUtilization(
            int deviceCapacity,
            List<List<Integer>> foregroundAppList,
            List<List<Integer>> backgroundAppList)
    {


        int temp=0;
        LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
        LinkedHashMap<Integer, Integer> back = new LinkedHashMap<>();
        List<List<Integer>> foregroundOutPut =new ArrayList<>();
        for(List foreApp:foregroundAppList){
        hm.put(Integer.parseInt(foreApp.get(0).toString()),Integer.parseInt(foreApp.get(1).toString()));
    }
        for(List foreApp:backgroundAppList){
            back.put(Integer.parseInt(foreApp.get(0).toString()),Integer.parseInt(foreApp.get(1).toString()));
        }
        System.out.println(hm);
        System.out.println(back);
        while(deviceCapacity>0) {
            for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
                for (Map.Entry<Integer, Integer> entryback : back.entrySet()) {
                    if (entry.getValue() + entryback.getValue() == deviceCapacity) {
                        ArrayList<Integer>  fout=new ArrayList<>();
                        fout.add(entry.getKey());
                        fout.add(entryback.getKey());
                        foregroundOutPut.add(fout);
                    }
                    else{
                        deviceCapacity--;
                    }

                }
            }
        }
        System.out.println(foregroundOutPut);
        }


    }
    // METHOD SIGNATURE ENDS
