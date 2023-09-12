import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int yr = stdIn.nextInt();
        if (yr%4 == 0 && (yr%100 != 0 || yr%400 ==0)){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
