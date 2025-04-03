import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//명령 프롬프트
public class DAY1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        char[] pattern = br.readLine().toCharArray();

        for (int i=0; i < N; i++) {
            char[] filename = br.readLine().toCharArray();
            for(int j=0; j<pattern.length; j++){
                if (pattern[j] != filename[j]) pattern[j] = '?';
            }

            System.out.println(pattern);
        }
    }
}