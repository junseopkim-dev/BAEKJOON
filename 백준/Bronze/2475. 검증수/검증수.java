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
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] num = new int[5];
        int sum =0;

        for (int i=0;i<5;i++){
            num[i] = Integer.parseInt(st.nextToken());
            sum += num[i]*num[i];
        }
        bw.write(String.valueOf(sum%10));

        bw.flush();
        bw.close();
        br.close();

    }
}
