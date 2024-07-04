import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                while(s1.length() < 15){
                    s1 =  s1.concat(" ");
                }
                String n = String.valueOf(x);
                while(n.length() < 3){
                    n  = "0"+n;
                }
                System.out.println(String.format("%s%s",s1, n));
            }
            System.out.println("================================");

    }
}



