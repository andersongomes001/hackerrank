import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int i = 1;
       while(scanner.hasNext()){
           String text = scanner.nextLine();
           System.out.println(String.format("%s %s", i, text));
           i += 1;
       }
    }
}
