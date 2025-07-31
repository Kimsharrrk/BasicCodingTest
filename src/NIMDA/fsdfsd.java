//// 현수막
//package Random._2025.Random1Day7M;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.StringTokenizer;
//
//public class Q14716 {
//
//    static class Pair {
//        int x, y;
//
//        public Pair(int x, int y) {
//            this.x = x;
//            this.y = y;
//        }
//    }
//
//    static int[][] board = new int[250][250];
//    static boolean[][] vis = new boolean[250][250];
//    static int[] dx = {0, 0, 1, -1, 1, 1, -1, -1};
//    static int[] dy = {1, -1, 0, 0, 1, -1, -1, 1};
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int m = Integer.parseInt(st.nextToken());
//        int n = Integer.parseInt(st.nextToken());
//        for (int i = 0; i < m; i++) {
//            StringTokenizer st1 = new StringTokenizer(br.readLine());
//            for (int j = 0; j < n; j++) {
//                board[i][j] = Integer.parseInt(st1.nextToken());
//                vis[i][j] = false;
//            }
//        }
//
//        int count = 0;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (board[i][j] == 0 || vis[i][j]) continue;
//
//                count++;
//
//                Queue<Pair> q = new LinkedList<>();
//                q.add(new Pair(i, j));
//
//                while (!q.isEmpty()) {
//                    Pair cur = q.poll();
//
//                    for (int dir = 0; dir < 8; dir++) {
//                        int nx = cur.x + dx[dir];
//                        int ny = cur.y + dy[dir];
//
//                        if (nx < 0 || nx >= m || ny < 0 || ny >= n) continue;
//                        if (board[nx][ny] == 0 || vis[nx][ny]) continue;
//
//                        vis[nx][ny] = true;
//                        q.add(new Pair(nx, ny));
//                    }
//                }
//
//            }
//        }
//
//        System.out.println(count);
//    }
//}
