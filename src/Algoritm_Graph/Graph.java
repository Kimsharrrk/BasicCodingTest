//package Algoritm_Graph;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Graph {
//    public static void main(String[] args) {
//
//        //인접행렬
//
//        int[][] array = {
//                {0, 0, 1, 1, 0},
//                {0, 0, 1, 1, 1},
//                {1, 1, 0, 0, 1},
//                {1, 1, 0, 0, 1},
//                {0, 1, 1, 1, 0}};
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        List<Integer> add_List1; // 동적 배열
//        //동적리스트 배열이 자바에서는 arraylist
//        //링크드 리스트는 자바에서 List
//
//
//        ArrayList<Integer>[] list = new ArrayList[5];
//
//        for(int[] edge : array) {
//            list.get(edge[0]).add(edge[1]);
//            list.get(edge[1]).add(edge[0]);
//        }
//
//
//
//
//        //
//
//
//
//
//
//
//    }
//}
//
////        List<List<Integer>> adjList = new ArrayList<>();
////        int numVertices = 0;
////        for (int i = 0; i < numVertices; i++) {
////            adjList.add(new ArrayList<>());
////            adjList.get(0).add(1);
////            adjList.get(1).add(0);
////        }
//
