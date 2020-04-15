
public class Birthday {

    public static void main(String[] args) {
        int days = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int person = 0;
        int counter = 0;
        boolean[] birthdays = new boolean[366];

        for (int i = 0; i < 24; i++) {

            int new_person = (int) (Math.random() * days);

            System.out.println(new_person);
            if (birthdays[new_person]) {
                counter++;
            } else {
                birthdays[new_person] = true;
            }

            System.out.println(counter);

        }

    }
}