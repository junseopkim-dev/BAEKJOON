import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] student = new boolean[30];
        for (int i=0;i<30;i++){
            student[i] = true;
        }

        for (int j = 0; j<28;j++){
            int stunum = Integer.parseInt(br.readLine());
            student[stunum-1]=false;
        }

        for (int k = 0; k<30; k++){
            if(student[k]==true){
                bw.write((k+1)+"\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
