import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String prod = String.valueOf(a*b*c);
        int[] freq = new int[10];
        for (int i = 0; i<prod.length();i++){
            int ind = prod.charAt(i)-48;
            freq[ind] +=1;
        }

        for (int i = 0; i<10; i++){
            bw.write(freq[i] + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
