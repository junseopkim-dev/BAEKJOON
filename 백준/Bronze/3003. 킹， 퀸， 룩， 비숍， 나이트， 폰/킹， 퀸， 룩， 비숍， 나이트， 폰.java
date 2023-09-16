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

        st = new StringTokenizer(br.readLine());
        int[] currentnum = new int[6];
        int[] adjust = {1,1,2,2,2,8};
        for (int i = 0 ; i<6; i++){
            currentnum[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i<6;i++){
            bw.write(String.valueOf(adjust[i]-currentnum[i]) + " ");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
