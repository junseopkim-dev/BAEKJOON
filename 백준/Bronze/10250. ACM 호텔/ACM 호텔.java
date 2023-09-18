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

        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i<t;i++){
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int xx = (n-1)/h+1;
            int yy = (n-1)%h+1;
            if(xx<10){
                bw.write(String.valueOf(yy)+"0"+String.valueOf(xx)+"\n");
            }
            else{
                bw.write(String.valueOf(yy)+String.valueOf(xx)+"\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}

