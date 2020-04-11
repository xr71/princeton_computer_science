public class BandMatrix {

    public static void main(String[] args) {
        int row = Integer.parseInt(args[0]);
        int distance = Integer.parseInt(args[1]);

        for (int r = 1; r <= row; r++) {
            for (int c = 1; c <= row; c++) {

                if (Math.abs(r-c) > distance) {
                    System.out.print("0 ");
                } else {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }
}
