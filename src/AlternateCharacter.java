import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class AlternateCharacter {

    // Complete the alternatingCharacters function below.
    static void alternatingCharacters() {
        String s="AAABB";
        ArrayList<Character> list = new ArrayList<>();
        list.add(0,s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            list.add(s.charAt(i));
            if(list.get(i-1)==s.charAt(i))
            {
                list.remove(s.charAt(i));
            }


        }
        System.out.println(list.size());


    }


    public static void main(String[] args) throws IOException {
        alternatingCharacters();
    }
       /* BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }*/
}
