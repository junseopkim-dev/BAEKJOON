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
        String a = st.nextToken();
        String b = st.nextToken();

        int reva= reverse(a);
        int revb = reverse(b);

        int max = Math.max(reva,revb);

        bw.write(Integer.toString(max));

        bw.flush();

        br.close();
        bw.close();



    }

    private static int reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }
}
