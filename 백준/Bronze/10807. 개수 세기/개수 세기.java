//Scanner

/*
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

*/

//BufferedReader

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

        int count = 0;
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        int a = Integer.parseInt(br.readLine());

        for(int j=0;j<n;j++){
            if(array[j] == a){
                count++;
            }
        }
        bw.write(count +"\n");

        bw.flush();
        br.close();
        bw.close();
    }
}


