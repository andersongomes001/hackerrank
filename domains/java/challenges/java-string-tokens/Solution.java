import java.io.*;
import java.util.*;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        s = s.replace("!", " ")
                .replace(",", " ")
                .replace("?", " ")
                .replace(".", " ")
                .replace("_", " ")
                .replace("@", " ")
                .replace("'", " ");
        List<String> data = Arrays.asList(s.split(" "));
        List<String> result = new ArrayList<>();
        for(String string: data){
            if(string.length() > 0){
                result.add(string);
            }
        }
        System.out.println(result.size());
        for (String string : result) {
            System.out.println(string);
        }
    }
}

