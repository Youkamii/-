import java.io.*;
import java.util.*;

public class Main {

    static int stoi(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer = 0;

        while (st.hasMoreTokens()) {
            int currentInt = stoi(st.nextToken());
            answer += (currentInt * currentInt);
        }
        
        System.out.println(answer % 10);
    }
}