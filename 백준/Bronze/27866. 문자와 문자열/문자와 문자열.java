import java.io.*;
import java.util.*;

public class Main {
    static int stoi(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        
        String s = st.nextToken();
        st = new StringTokenizer(br.readLine());
        int i = stoi(st.nextToken());
        
        System.out.println(s.charAt(i - 1));
        
        return ;
    }
}