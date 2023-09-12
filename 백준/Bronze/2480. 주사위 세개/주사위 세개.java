import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int dice1 = stdIn.nextInt();
        int dice2 = stdIn.nextInt();
        int dice3 = stdIn.nextInt();
        if(dice1==dice2 && dice2==dice3){
            System.out.println(10000+dice1*1000);
        }
        else if(dice1 == dice2){
            System.out.println(1000+dice1*100);
        }
        else if(dice2 == dice3){
            System.out.println(1000+dice2*100);
        }
        else if(dice3 == dice1){
            System.out.println(1000+dice3*100);
        }
        else{
            if(dice1 > dice2 && dice1>dice3){
                System.out.println(dice1*100);
            }
            else if(dice2>dice1 && dice2>dice3){
                System.out.println(dice2*100);
            }
            else{
                System.out.println(dice3*100);
            }
        }
    }
}
