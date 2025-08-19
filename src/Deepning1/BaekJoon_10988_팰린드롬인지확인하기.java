package Deepning1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_10988_팰린드롬인지확인하기 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String word = bf.readLine();

        boolean check = false;
        int left = 0;
        int right = word.length()-1;

        for (int i = 0; word.length() > i; i++){

            if (word.length() == 1){
                check = true;
                break;
            }



            if (left != right){

                if (word.charAt(left) == word.charAt(right)){

                    check = true;

                    right--;
                    left++;

                }else {
                    check = false;
                    break;
                }

            }else {
                break;
            }


        }

        if (check){
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
}
