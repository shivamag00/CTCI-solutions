import java.io.*;
import java.util.Hashtable;

public class is_unique {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input  = br.readLine().toCharArray();
        
        
        Hashtable<Character, Integer> tally = new Hashtable<Character, Integer>();
        for (char i : input) {
            if (!tally.containsKey(i))
                tally.put(i, 0);
            else {
                System.out.println(" String does not contain unique characters"); 
                return;
            }
        }
        System.out.println("String contains unique elements");
    }
}