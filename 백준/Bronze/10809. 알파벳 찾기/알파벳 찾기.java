import java.io.*;
import java.util.*;

public class Main {
    
    static int stoi(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] answer = new int[26];
        String str = st.nextToken();        
        Arrays.fill(answer, -1);
        
        for (int i = 0; i < str.length(); i++) {
            if (answer[str.charAt(i) - 'a'] == -1) {
                answer[str.charAt(i) - 'a'] = i;
            }
        }
        
        for (int i = 0; i < 26; i++) {
            System.out.print(answer[i]);
            if (i < 25)
                System.out.print(" ");
        }
    }
}