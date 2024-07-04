import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution {

    public static void main(String[] args) {
        try{
            int total = 0;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.valueOf(br.readLine());
            List<Integer> myArray = Arrays
                                        .asList(br.readLine().split(" "))
                                        .stream()
                                        .map(Integer::valueOf)
                                        .collect(Collectors.toList());
             for(int i =0;i < n;i++){
                 int sum =0;
                 for(int e=i; e < n; e++){   
                    sum += myArray.get(e);
                    if(sum < 0){
                        total++;
                    }
                 }
             }
            
            
            System.out.println(total);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
