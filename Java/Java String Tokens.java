import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if(s.length() == 0){
            System.out.println(0);
        }
        else{
            s = s.replaceAll("[^\\p{Alpha}]+", " ").trim();
            
            if(s.isEmpty()) {
                 System.out.println(0);
            }
            else {
                String[] strings = s.split("\\p{Space}+");
                
                System.out.println(strings.length);
                
                for(String str : strings){
                    System.out.println(str);
                }
            }
        }
    }
}
