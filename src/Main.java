import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer status = new StringTokenizer(input.readLine());
        int dmgA = Integer.parseInt(status.nextToken());
        int hpA = Integer.parseInt(status.nextToken());

        status = new StringTokenizer(input.readLine());
        int dmgB = Integer.parseInt(status.nextToken());
        int hpB = Integer.parseInt(status.nextToken());


        while (true) {
            hpB = hpB - dmgA;
            hpA = hpA -dmgB;

            if (hpA <= 0 && hpB <= 0) {
                System.out.println("DRAW");
                break;
            } else if (hpA <= 0) {
                System.out.println("PLAYER B");
                break;
            } else if (hpB <= 0) {
                System.out.println("PLAYER A");
                break;
            }
        }
    }
}