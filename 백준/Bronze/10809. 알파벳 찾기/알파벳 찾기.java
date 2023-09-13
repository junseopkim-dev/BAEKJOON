import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int[] spelling = new int[26];

        for(int i = 0;i<26;i++){
            spelling[i]=-1;
        }
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int ind = c - 'a';
            if(spelling[ind]==-1){
                spelling[ind] = i;
            }
        }
        for (int i = 0;i<26;i++){
            bw.write(spelling[i] + " ");
        }
        bw.flush();
        br.close();
        br.close();
    }
}
