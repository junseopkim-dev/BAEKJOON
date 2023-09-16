import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine().toUpperCase();
        int[] freq = new int[26];

        for(int i = 0; i<input.length();i++){
            char c =input.charAt(i);
            if(c >='A' && c <= 'Z'){
                freq[c-'A']++;
            }
        }

        char mostFreq = '?';
        int maxcount =0;

        for(int i=0;i<26;i++){
            if(freq[i]>maxcount){
                maxcount = freq[i];
                mostFreq = (char)('A'+i);
            }
            else if(freq[i] == maxcount){
                mostFreq = '?';
            }
        }

        bw.write(mostFreq);



        bw.flush();
        br.close();
        bw.close();
    }
}
