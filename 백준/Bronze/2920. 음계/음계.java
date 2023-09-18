import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] seq = new int[8];
        int asc = 1;
        int des = 1;

        for(int i=0; i<8; i++){
            seq[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<7; i++){
            if(seq[i]<seq[i+1]){
                asc = asc * 1;
            }
            else{
                asc = asc * 0;
            }
            if(seq[i]>seq[i+1]){
                des = des*1;
            }
            else{
                des = des*0;
            }
        }
        if(asc >0){
            bw.write("ascending");
        } else if (des > 0) {
            bw.write("descending");
        }
        else{
            bw.write("mixed");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
