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


        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] basket = new int[n];

        for(int p = 0; p<n;p++){
            basket[p] = p+1;
        }

        for(int p = 0; p<m; p++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int[] temp = new int[j-i+1];

            for(int q = 0; q<j-i+1;q++){
                temp[q]=basket[j-1-q];
            }
            for(int q = i-1; q<=j-1;q++){
                basket[q]=temp[1-i+q];
            }
        }
        for(int p =0; p<n;p++){
            bw.write(basket[p] +" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
