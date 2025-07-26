import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cookTime = Integer.parseInt(bf.readLine());

        int total = M + cookTime;

        if (total >= 60){
            H = H + total / 60;
            M = total % 60;
        } else {
            M = total;
        }

        if (H >= 24){
            H = H - 24;
        }

        System.out.println(H + " " + M);
    }
}