package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int []num = new int[10];

        for (int i=0 ; 10 > i; i++){
             num[i] = Integer.parseInt(bf.readLine());
        }



        for (int i= 0;10>i; i++){
            num[i] = num[i] % 42;
            System.out.println(num[i]);
        }

        //bolean 써서 if 로 비교하면 될듯.. 잠시 눕자...

    }
}
