import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(fun(scn.nextInt()));
    }
    public static int fun(int n){
        if(n==0 || n==1){
            return n+1;
        }else{
            return fun(n-1)+fun(n/2);
        }
    }
}