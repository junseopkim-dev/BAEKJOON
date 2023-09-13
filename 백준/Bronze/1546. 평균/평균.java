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

        int n = Integer.parseInt(br.readLine());
        float[] score = new float[n];
        float max =0;
        float sum = 0;
        float mean;

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            score[i] = Integer.parseInt(st.nextToken());
            if(max<score[i]){
                max = score[i];
            }
        }
        for(int i=0; i<n;i++){
            sum += score[i]/max*100;
        }
        mean=sum/n;
        bw.write(mean+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
