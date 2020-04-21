public class Minesweeper {
    public static void main(String[] args) {

        // m by n grid of mines
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        // k number of mines
        int k = Integer.parseInt(args[2]);
        // this is base land of mine, for identification
        int[][] minesLand = new int[m][n];
        // this is the layer of counting grid of mines
        int[][] minesCountLand = new int[m][n];

        int numMines = 0;

        while (numMines < k) {
            int rm = (int) (Math.random() * m);
            int rn = (int) (Math.random() * n);

            // System.out.println(rm + " " + rn);

            if (minesLand[rm][rn] == 0) {
                minesLand[rm][rn] = 1;
                numMines++;
            } else {
                continue;
            }

        }

        int numcheck = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(minesLand[i][j] + "  ");
                numcheck = numcheck + minesLand[i][j];
            }

            System.out.println();
        }

        System.out.println();
        System.out.println(numcheck);
    }
}
