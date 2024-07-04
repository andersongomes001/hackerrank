import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            StringBuilder builder = new StringBuilder();
            for(int s=1; s <=n;s++){
                int result = a;
                for(int c=0;c < s;c++){
                    result += Math.pow(2, c) * b;
                }
                builder.append(String.format("%s ", result));
            }
            System.out.println(builder);
        }
        in.close();
    }
}
