import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        System.out.println("q: ");
        int q=in.nextInt();
        for(int i=0;i<q;i++){
            System.out.println("a: ");
            int a = in.nextInt();
            System.out.println("b: ");
            int b = in.nextInt();
            System.out.println("n: ");
            int n = in.nextInt();
            int sum=a;
            for(int j=0; j<n; j++){
                sum=sum+(int)Math.pow(2,j)*b;
                System.out.print(sum+" ");
            }
            System.out.println();
        }
        in.close();
    }
}