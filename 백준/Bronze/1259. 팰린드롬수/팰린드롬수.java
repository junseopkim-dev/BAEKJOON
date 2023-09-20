import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String input = br.readLine();
            if(input.equals("0")){
                break;
            }
            else{
                StringBuffer sb = new StringBuffer(input);
                String reverse = sb.reverse().toString();
                if(input.equals(reverse)){
                    bw.write("yes\n");
                }
                else{
                    bw.write("no\n");
                }
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
