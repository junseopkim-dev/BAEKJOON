//BufferedReader

/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[] array = new int[n];

        st=new StringTokenizer(br.readLine());

        for(int i = 0;i<n;i++){
            array[i] = Integer.parseInt(st.nextToken());
            if(array[i] < x){
                bw.write(array[i] + " ");
            }
        }
        bw.flush();
        br.close();
        bw.close();

    }
}

*/


//Scanner

// /*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int x = stdIn.nextInt();
        int[] array = new int[n];

        for (int i=0; i<n; i++){
            array[i] = stdIn.nextInt();
        }

        stdIn.close();

        for (int i=0; i<n;i++){
            if(array[i] < x){
                System.out.print(array[i]+" ");
            }
        }
    }
}

// */
 