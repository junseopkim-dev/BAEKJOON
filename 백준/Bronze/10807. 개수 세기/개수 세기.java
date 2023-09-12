//Scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int count = 0;
        int n = stdIn.nextInt();
        int[] array = new int[n];

        for(int i = 0; i<n;i++){
            array[i] = stdIn.nextInt();
        }
        int a = stdIn.nextInt();
        for(int j =0;j<n;j++){
            if(a == array[j]){
                count +=1;
            }
        }
        System.out.println(count);
    }
}



//BufferedReader
/*

public class q10807 {
}

 */
