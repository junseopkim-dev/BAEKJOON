
//빠른 버전


import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        //Scanner stdIn = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i<t; i++){
            st = new StringTokenizer(br.readLine());
            bw.write("Case #"+(i+1)+": "+(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
        }
        bw.close();
    }
}


/*
// 느린 버전
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int t = stdIn.nextInt();
        for(int i=0;i<t;i++){
            int a = stdIn.nextInt();
            int b = stdIn.nextInt();
            System.out.println("Case #"+(i+1)+": "+ (a+b));
        }
        stdIn.close();
    }
}
*/