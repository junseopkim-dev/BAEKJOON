import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int temp1 = b%10;
        int temp2 = (b%100)/10;
        int temp3 = b/100;

        System.out.println(a*temp1);
        System.out.println(a*temp2);
        System.out.println(a*temp3);
        System.out.println(a*b);

    }
}
