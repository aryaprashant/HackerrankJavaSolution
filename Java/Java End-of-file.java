import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int line_num = 0;
        while(scan.hasNext())
        	System.out.println(++line_num + " " + scan.nextLine());
        scan.close();
        
    }
}