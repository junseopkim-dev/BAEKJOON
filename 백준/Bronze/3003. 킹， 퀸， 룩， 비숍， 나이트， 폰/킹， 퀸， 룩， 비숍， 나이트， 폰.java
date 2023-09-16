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
        int[] adjust = new int[6];
        for (int i = 0 ; i<6; i++){
            currentnum[i] = Integer.parseInt(st.nextToken());
        }
        currentnum[0] = 1- currentnum[0];
        currentnum[1] = 1- currentnum[1];
        currentnum[2] = 2- currentnum[2];
        currentnum[3] = 2-currentnum[3];
        currentnum[4] = 2-currentnum[4];
        currentnum[5] = 8-currentnum[5];

        for(int i = 0; i<6;i++){
            bw.write(currentnum[i] + " ");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
