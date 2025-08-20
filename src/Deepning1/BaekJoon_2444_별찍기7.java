package Deepning1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_2444_별찍기7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        // 위쪽 삼각형
        for (int i = 1; i <= num; i++) {
            System.out.print(" ".repeat(num - i));
            System.out.println("*".repeat(2 * i - 1));
        }

        // 아래쪽 삼각형
        for (int i = num - 1; i >= 1; i--) {
            System.out.print(" ".repeat(num - i));
            System.out.println("*".repeat(2 * i - 1));
        }
    }
}