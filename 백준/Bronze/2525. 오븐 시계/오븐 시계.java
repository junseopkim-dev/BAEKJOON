import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int hh = stdIn.nextInt();
        int mm = stdIn.nextInt();
        int baketime = stdIn.nextInt();

        hh += baketime/60;
        mm += baketime%60;

        if (mm>=60){
            hh += 1;
            mm -= 60;
        }

        if (hh >= 23){
            hh %= 24;
        }


        System.out.println(hh +" "+mm);

    }
}
