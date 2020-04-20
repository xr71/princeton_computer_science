
public class Birthday {

    public static void main(String[] args) {
        int days = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int person = 1;
        int counter = 0;
        boolean[] birthdays = new boolean[days];
        int exactperson = 0;
        double frac = 0;


        while (frac < 0.5) {
            frac = 0.0;
            counter = 0;
            exactperson = 0;

            for (int i = 0; i < trials; i++) {
                birthdays = new boolean[days];

                for (int p = 0; p < person; p++) {
                    int new_person = (int) (Math.random() * days);

                    if (birthdays[new_person]) {
                        counter++;
                        if (p == person-1) exactperson++;
                        break;
                    } else {
                        birthdays[new_person] = true;
                    }
                }
            }
            frac = (double) counter / (double) trials;
            System.out.println(person + "\t" + exactperson + "\t" + frac);
            person++;
        }
    }
}
