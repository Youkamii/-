import java.io.*;
import java.util.*;

public class Main {
    
    static int stoi(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] intArray = new int[8];
        int i = 0;
        int flag = 0;
        
        while(st.hasMoreTokens()) {
            intArray[i] = stoi(st.nextToken());
            i++;
        }
        
        if (intArray[0] == 1) {
            flag = 1;            
            for (i = 0; i < 7; i++) {
                if(!(intArray[i + 1] - intArray[i] == 1)) {
                    System.out.println("mixed");
                    return ;
                }
            }
        } else if (intArray[0] == 8){
            flag = -1;            
            for (i = 0; i < 7; i++) {
                if(!(intArray[i + 1] - intArray[i] == -1)) {
                    System.out.println("mixed");
                    return ;
                }
            }
        } else {
            System.out.println("mixed");
            return ;
        }
        
        if (flag == 1) {
            System.out.println("ascending");
        } else if (flag == -1) {
            System.out.println("descending");
        }
    }
}