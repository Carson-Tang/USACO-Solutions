import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        if(n==1){
            System.out.println(1);
        }else if (n==2){
            System.out.println(2);
        }else if (n==3){
            System.out.println(2);
        } else if (n==4){
            System.out.println(3);
        } else if (n==5){
            System.out.println(3);
        } else if (n==6){
            System.out.println(3);
        } else if (n==7){
            System.out.println(2);
        } else if (n==8){
            System.out.println(2);
        } else if (n==9){
            System.out.println(1);
        } else if (n==10){
            System.out.println(1);
        }
    }
}
