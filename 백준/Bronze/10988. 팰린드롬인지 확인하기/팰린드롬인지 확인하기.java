import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputtext = br.readLine();
        StringBuffer sb = new StringBuffer(inputtext);
        String reverse = sb.reverse().toString();
        int pelindrom = 0;

        if(inputtext.equals(reverse)){
            pelindrom = 1;
        }
        else{
            pelindrom = 0;
        }
        bw.write(pelindrom + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
