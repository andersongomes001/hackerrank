import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        Integer hourglassSumTotal = null;
        for(int i =0; i < arr.size()-2;i++){
                for(int j = 0; j < arr.get(i).size()-2; j ++){
                        List<Integer> newList = new ArrayList<>();
                        newList.addAll(Arrays.asList(arr.get(i).get(j),arr.get(i).get(j+1),arr.get(i).get(j+2)));
                        newList.addAll(Arrays.asList(arr.get(i+1).get(j+1)));
                        newList.addAll(Arrays.asList(arr.get(i+2).get(j),arr.get(i+2).get(j+1),arr.get(i+2).get(j+2)));
                        Integer total = newList.stream().reduce(0,Integer::sum);
                        if(hourglassSumTotal == null){
                            hourglassSumTotal = total;
                        }
                        if(total > hourglassSumTotal){
                            hourglassSumTotal = total;
                        }
                    }
            }
        
        System.out.println(hourglassSumTotal);

        bufferedReader.close();
    }
}
