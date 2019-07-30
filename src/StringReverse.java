import java.util.ArrayList;

public class StringReverse {
    public static void main(String args[])
    {
        //String check="i.like.this.program.very.much";
        String check="pqr.mno";
        String[] splitedArray = check.split("\\.");
        StringBuilder str = new StringBuilder();
       for(int i=splitedArray.length-1;i>=0;i--)
        {
            str.append(splitedArray[i]).append(".");
        }
        str.deleteCharAt(str.length()-1);
        System.out.println(str);
    }

}
