public class Array0 {
    public static void main(String[] args) {
        double[] a;
        a = new double[10];
        a[0] = 0;
        double[] b;
        b = a;
        System.out.println(a[0]);
        System.out.println(b[0]);

        System.out.println(a);
        System.out.println(b);

    }
}
