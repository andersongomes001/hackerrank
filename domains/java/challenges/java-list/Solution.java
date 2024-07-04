import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(scanner.nextInt());
        }
        scanner.nextLine();
        int q = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < q; i++) {
            String op = scanner.nextLine();
            if(op.equalsIgnoreCase("Insert")){
                int index = scanner.nextInt();
                int element = scanner.nextInt();
                l.add(index, element);
            }
            if(op.equalsIgnoreCase("Delete")){
                int index = scanner.nextInt();
                l.remove(index);
            }
            if(scanner.hasNext()){
                scanner.nextLine();
            }
        }
        for(Integer i : l){
            System.out.print(String.format("%s ", i));
        }
    }
}
