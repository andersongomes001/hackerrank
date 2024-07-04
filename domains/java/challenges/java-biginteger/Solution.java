import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        
        BigInteger big = new BigInteger(a);
        System.out.println(String.format("%s",(new BigInteger(a)).add(new BigInteger(b))));
        System.out.println(String.format("%s", (new BigInteger(a)).multiply(new BigInteger(b))));
    }
}
