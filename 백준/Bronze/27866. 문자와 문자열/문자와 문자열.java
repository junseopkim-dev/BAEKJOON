import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String text = br.readLine();
        int i = Integer.parseInt(br.readLine());

        bw.write(text.charAt(i-1)+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
