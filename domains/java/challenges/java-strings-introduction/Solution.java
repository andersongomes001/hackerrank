import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=capt(sc.next());
        String B=capt(sc.next());
        System.out.println(A.length() + B.length());
        List<String> lista = Arrays.asList(A,B);
        Collections.sort(lista);
        System.out.println(!A.equalsIgnoreCase(lista.get(0)) ? "Yes":"No");
        System.out.println(String.format("%s %s", A,B));
    }
    
    public static String capt(String data){
        return data.substring(0,1).toUpperCase()+data.substring(1);
    }
}



