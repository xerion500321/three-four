import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(fun(scn.nextInt()));
    }
    public static int fun(int n){
        if(n==1 || n==2){
            return 1;
        }else{
            return fun(n-1)+fun(n-2);
        }
    }
}