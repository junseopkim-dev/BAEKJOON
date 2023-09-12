//빠른 버전

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while(true){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a ==0 && b==0){
                break;
            }

            bw.write((a+b)+"\n");
        }
        bw.close();
    }
}


//느린 버전

/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        while(true){
            int a = stdIn.nextInt();
            int b = stdIn.nextInt();
            if(a==0 && b==0){
                break;
            }
            System.out.println(a+b);
        }
        stdIn.close();
    }
}

*/