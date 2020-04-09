public class RightTriangle {

    public static void main(String[] args) {
        int side1 = Integer.parseInt(args[0]);
        int side2 = Integer.parseInt(args[1]);
        int side3 = Integer.parseInt(args[2]);

        if (side1 < 0 || side2 < 0 || side3 < 0) {
            System.out.println("false");

            return;
        }

        int max_side = Math.max(Math.max(side1, side2), side3);

        int sum_squares = 0;
        int current_n = 0;
        for (int i = 0; i < 3; i++) {
            current_n = Integer.parseInt(args[i]);
            if (current_n != max_side) {
                sum_squares = sum_squares + current_n * current_n;
            }
        }

        if (sum_squares == max_side * max_side) {
            System.out.println("true");
            return;
        } else {
            System.out.println("false");
            return;
        }
    }
}
