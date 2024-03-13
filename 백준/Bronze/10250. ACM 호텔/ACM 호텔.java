import java.io.*;
import java.util.*;

public class Main {
    
    static int stoi(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = stoi(st.nextToken());
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int H = stoi(st.nextToken());
            int W = stoi(st.nextToken());
            int R = stoi(st.nextToken());
            
            int floor;
            if (R % H == 0) {
                floor = H;
            } else {
                floor = R % H;
            }
            
            int answer = floor * 100 + (R - 1) / H + 1;
            System.out.println(answer);
        }
    }
}