import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = new int[9];
        int max_value = 0;
        int max_address = 0;

        for(int i=0;i<9;i++){
            array[i] = Integer.parseInt(br.readLine());
            if(i ==0){
                max_value = array[i];
                max_address = i+1;
            }
            if (array[i]>max_value){
                max_value = array[i];
                max_address = i+1;
            }
        }
        bw.write(max_value + "\n" + max_address);

        bw.flush();
        br.close();
        br.close();
    }
}
