package Deepning1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_1157_단어공부 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // 단어를 받고 대문자로 전부 바꾸고

        String alph = bf.readLine();

        alph = alph.toUpperCase();

        //
        int AlphArray[] = new int[26];

        int inputSpelling;

        //아스키코드로 바꾼 문자를 배열에 넣어서 위치 확인.
        for (int i = 0; alph.length() > i; i++) {
            char a = alph.charAt(i);
            inputSpelling = (int) a;
            AlphArray[inputSpelling - 65]++;
        }

        int max = AlphArray[0];
        int idx = 0;

        for (int i = 0; AlphArray.length > i; i++) {

            if (AlphArray[i] > max) {
                max = AlphArray[i];
                idx = i;
            }
        }

        int count = 0;
        for (int i = 0; i < AlphArray.length; i++) {
            if (AlphArray[i] == max) count++;
        }

        if (count > 1) {
            System.out.println("?");
        } else {
            System.out.println((char)(idx + 65));
        }
    }
}
