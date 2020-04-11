public class FindFactors {

    public static void main(String[] args) {
        Long mynum = Long.parseLong(args[0]);
        int N = Math.round(mynum / 2);

        for (int i = 2; i <= mynum/i; i++) {
            while (mynum % i == 0) {
                System.out.print(i + " ");
                mynum = mynum / i;
            }

        }

        if (mynum > 1) {System.out.println(mynum);}
        else {System.out.println();}

    }
}
