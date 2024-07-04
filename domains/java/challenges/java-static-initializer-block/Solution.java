import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        if(b <= 0 || h <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            return;
        }
        System.out.println(b * h);
    }
}
