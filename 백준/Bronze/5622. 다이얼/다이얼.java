import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String text = br.readLine();
        int sec = 0;
        char[] dial = new char[text.length()];

        for (int i = 0; i<text.length();i++){
            dial[i] = text.charAt(i);
            if(dial[i] <68){
                sec += 3;
            }
            else if(dial[i] < 71){
                sec += 4;
            }
            else if(dial[i] < 74){
                sec += 5;
            }
            else if(dial[i] < 77){
                sec +=6;
            }
            else if(dial[i] < 80){
                sec +=7;
            }
            else if(dial[i]<84){
                sec +=8;
            }
            else if(dial[i]<87){
                sec +=9;
            }
            else{
                sec +=10;
            }
        }

        bw.write(String.valueOf(sec));
        bw.flush();
        bw.close();
        br.close();
    }
}
