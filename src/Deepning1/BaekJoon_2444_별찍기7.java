//package Deepning1;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class BaekJoon_2444_별찍기7 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//
//        int num = Integer.parseInt(bf.readLine());
//
//        for (int i = 1; num >= i; i++) {
//            for (int j = 1; num - i >= j; j++) {
//                System.out.print(" ".repeat(j));
//
//            }
//
//            for (int j = 1; j <= 2*i-1; j++) {
//                System.out.println("*".repeat(j));
//            }
//        }
//
////        int j = num-1;
////        for (int i = 1; num >= i ; i++){
////
////            System.out.print(" ".repeat(j));
////            System.out.println("*".repeat(i));
////
////            j--;
////
////
////
////
////        }
//    }
//}
