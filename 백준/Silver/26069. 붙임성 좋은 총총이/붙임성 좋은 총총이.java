import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        String userA, userB;

        HashSet<String> enterUser = new HashSet<String>();
        enterUser.add("ChongChong");
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i<N;i++){
            st = new StringTokenizer(br.readLine());
            userA = st.nextToken();
            userB = st.nextToken();

            if(enterUser.contains(userA) || enterUser.contains(userB)){
                enterUser.add(userA);
                enterUser.add(userB);
            }
        }
        br.close();

        bw.write(enterUser.size() + "\n");
        bw.flush();
        bw.close();
    }
}
