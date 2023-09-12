import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int hh = stdIn.nextInt();
        int mm = stdIn.nextInt();
        if (mm<45){
            if(hh==0){
                hh = 23;
                mm += 60-45;
            }
            else{
                hh -= 1;
                mm += 60-45;
            }
        }
        else{
            mm -=45;
        }


        System.out.println(hh + " "+mm);
    }
}
