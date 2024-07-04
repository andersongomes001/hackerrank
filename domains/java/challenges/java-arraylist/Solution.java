import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<List<Integer>> rootList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            rootList.add(
                Arrays.asList(scanner.nextLine().replace("\n", "").split(" "))
                .stream()
                .map(
                    x -> Integer.valueOf(x.trim())
                ).collect(Collectors.toList())
            );
        }
        int q = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < q; i++) {
            List<Integer> data = Arrays.asList(
                scanner.nextLine().replace("\n", "").split(" ")
            )
            .stream()
            .map(x -> Integer.valueOf(x.trim()))
            .collect(Collectors.toList());
            try{
                System.out.println(rootList.get(data.get(0)-1).get(data.get(1)));
            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
