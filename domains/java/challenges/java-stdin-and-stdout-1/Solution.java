import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> lista = new ArrayList<Integer>();
        int n = 0;
        while (n < 3){
            int a = scan.nextInt();
            lista.add(a);
            n++;
        }


        for (Integer numero: lista) {
            System.out.println(numero);
        }
    }
}
