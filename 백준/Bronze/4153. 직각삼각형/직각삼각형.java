import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        while(true){
            st = new StringTokenizer(br.readLine());
            int[] input = new int[3];
            int sum = 0;

            for (int i =0; i<3; i++){
                input[i] = Integer.parseInt(st.nextToken());
                sum +=input[i];
            }

            if(sum ==0){
                break;
            }

            Arrays.sort(input);
            if(input[2]*input[2] == input[0]*input[0]+input[1]*input[1]){
                bw.write("right\n");
            }
            else{
                bw.write("wrong\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
