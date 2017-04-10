import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int k = scan.nextInt();
        List<String> strsub = new ArrayList<String>();
        
        for(int i = 0; i<= str.length()-k;i++)
            {
            strsub.add(str.substring(i,i+k));
             }
        Collections.sort(strsub);
        System.out.println(strsub.get(0));
        System.out.println(strsub.get(strsub.size()-1));
        
        
        
    }
}