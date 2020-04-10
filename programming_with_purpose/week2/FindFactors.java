public class FindFactors {

    public static void main(String[] args) {
        Long mynum = Long.parseLong(args[0]);


        for (int i = 2; i <= mynum; i++) {
            while (mynum % i == 0) {
                System.out.print(i + " ");
                mynum = mynum / i;
            }

        }

    }
}
