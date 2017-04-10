import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        BigInteger A, B;
        A = BigInteger.ONE;
        
        BigInteger  Sum = (new BigInteger(a)).add(new BigInteger(b));
        BigInteger Mul = (new BigInteger(a)).multiply(new BigInteger(b));
        
        System.out.println(Sum);
        
        System.out.println(Mul);
    }
}