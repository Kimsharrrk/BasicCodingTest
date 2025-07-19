package conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_2525_OvenClock {
    public static void main(String[] args) throws IOException {
        BufferedReader Bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer St = new StringTokenizer(Bf.readLine());


        int H = Integer.parseInt(St.nextToken());
        int M = Integer.parseInt(St.nextToken());
        StringTokenizer St2 = new StringTokenizer(Bf.readLine());

        int CookTime = Integer.parseInt(St2.nextToken());
        int count = 0;


        M += CookTime;

        if (M > 60){
            M = 0;
            CookTime -= 60;
            for (int i = 0; M > 60; i++){

                CookTime -= 60;
                M += CookTime;
                count++;



            }
            H += count;


        }

        System.out.println(H + " " + M);
    }
}
