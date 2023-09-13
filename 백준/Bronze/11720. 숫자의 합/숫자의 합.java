import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String text = br.readLine();
        int sum = 0;

        for(int i=0; i<n; i++){
            int num = Character.getNumericValue(text.charAt(i));
            sum += num;
        }

        bw.write(Integer.toString(sum)); // toString을 통해 String 형태로 출력
        bw.flush();
        br.close();
        bw.close();
    }
}
