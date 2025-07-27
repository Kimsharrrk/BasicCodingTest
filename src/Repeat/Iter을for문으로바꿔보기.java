package Repeat;

public class Iter을for문으로바꿔보기 {
    public static void main(String[] args) {
        int []array = {1,2,3,4,5};



        System.out.println(" ");//줄바꿈 용


        //iter ( 향상된 for문) 는 배열안에 값을 전부 빼서 int i에 넣어주는 반복문이다.

        for (int i : array) {
            System.out.println(i);
        }

        //iter를 그냥 for문으로 표현.

        int j = 0;
        for (int i =0; array.length > i; i++){
            j = array[i];
            System.out.println(j);
        }
    }
}
