public class RandomWalker {

    public static void main(String[] args) {
        double r;
        int md = Integer.parseInt(args[0]);
        int distance = 0;

        int steps = 0;
        int x = 0, y = 0;

        while (distance < md) {
            r = Math.random();

            if (r < 0.25) {
                x++;
            }
            else if (r < 0.5) {
                x--;
            }
            else if (r < 0.75) {
                y++;
            }
            else if (r < 1) {
                y--;
            }

            System.out.println("(" + x + ", " + y + ")");
            distance = (Math.abs(x) + Math.abs(y));
            steps++;
        }
        System.out.println("steps = " + steps);
    }
}
