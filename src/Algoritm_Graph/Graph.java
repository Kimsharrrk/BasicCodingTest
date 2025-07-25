package Algoritm_Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Graph {
    public static void main(String[] args) {

        //인접행렬

        int[][] array = {
                {0, 0, 1, 1, 0},
                {0, 0, 1, 1, 1},
                {1, 1, 0, 0, 1},
                {1, 1, 0, 0, 1},
                {0, 1, 1, 1, 0}};

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


        //인접리스트 [] ( ArrayList 사용 )

        ArrayList<Integer>[] graph = new ArrayList[4];
        for (int i = 1; i <= 3; i++) {
            graph[i] = new ArrayList<>();
        }
        //넣는거
        graph[1].add(2);
        graph[2].add(1);

        //뺴는거
        System.out.println(graph[1].get(0));
        System.out.println(graph[2].get(0));

        //인접리스트 ( List 인터페이스 사용 ) , 그 이유는 유연한 코딩이 가능함 Arraylist가 List애 포함되어있기에 List안에는 linked, array 등등 있음










        //






    }
}

//        List<List<Integer>> adjList = new ArrayList<>();
//        int numVertices = 0;
//        for (int i = 0; i < numVertices; i++) {
//            adjList.add(new ArrayList<>());
//            adjList.get(0).add(1);
//            adjList.get(1).add(0);
//        }

