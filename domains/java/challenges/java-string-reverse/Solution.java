import java.io.*;
import java.util.*;
import java.util.List;
import java.util.Collections;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        List<String> lista = Arrays.asList(A.split(""));
        Collections.reverse(lista);
        String out = lista.toString().replace(", ", "");
        System.out.println(A.equalsIgnoreCase(out.substring(1,out.length() - 1))?"Yes":"No");
        
    }
}



