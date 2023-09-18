import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());


        for (int i=0; i<n;i++){
           String ox = br.readLine();
           int streak = 0;
           int score = 0;
           for(int j = 0; j<ox.length();j++){
               if (ox.charAt(j) == 'O'){
                   streak +=1;
                   score+=streak;
               }
               else{
                   streak = 0;
                   score += streak;
               }

           }
           bw.write(score+"\n");

        }
        bw.flush();
        br.close();
        bw.close();
    }
}
