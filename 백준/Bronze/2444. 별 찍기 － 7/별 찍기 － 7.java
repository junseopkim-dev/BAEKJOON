import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i<num;i++){
            for(int j = num-i-1; j>0;j--){
                bw.write(" ");
            }
            for(int k=0;k<2*i+1;k++){
                bw.write("*");
            }


            bw.write("\n");

        }
        for (int i = 0; i<num-1;i++){
            for(int j = 0; j<i+1;j++){
                bw.write(" ");
            }
            for(int k=2*num-2*i-3;k>0;k--){
                bw.write("*");
            }


            bw.write("\n");

        }
        bw.flush();
        bw.close();
        br.close();


    }
}
