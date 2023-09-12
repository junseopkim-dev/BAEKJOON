//빠른 버전
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
        String input =""; // 유의

        while((input=br.readLine()) != null) //EOF 구현. 콘솔창에서 null 입력은 ctrl + D,
        {
            st = new StringTokenizer(input); // 유의
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write((a+b)+"\n");
        }
        bw.close();
    }
}




//느린 버전
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        while(stdIn.hasNext()){
            int a = stdIn.nextInt();
            int b = stdIn.nextInt();
            System.out.println(a+b);
        }
    }
}


 */

