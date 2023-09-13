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

        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        int max=0;
        int min=0;

        st = new StringTokenizer(br.readLine());
        for (int i=0;i<n;i++){
            array[i] = Integer.parseInt(st.nextToken());
            if(i ==0){
                max = array[i];
                min = array[i];
            }
            if(array[i]>max){
                max = array[i];
            }
            if(array[i]<min){
                min = array[i];
            }
        }
        bw.write(min +" "+ max+"\n");
        bw.flush();
        br.close();
        bw.close();


    }
}
