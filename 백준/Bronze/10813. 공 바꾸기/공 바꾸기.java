import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] basket = new int[n];

        for (int p = 0; p<n; p++){
            basket[p]=p+1;
        }

        while(m>0){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int temp = 0;
            temp = basket[i-1];
            basket[i-1] = basket[j-1];
            basket[j-1] = temp;
            m--;
        }
        for(int q=0; q<n;q++){
            bw.write(basket[q] + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
