import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        while(n>0){
            String text = br.readLine();
            bw.write(text.charAt(0));
            bw.write(text.charAt(text.length()-1));
            bw.write("\n");
            n--;
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
