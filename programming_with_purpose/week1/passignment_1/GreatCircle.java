public class GreatCircle {

    public static void main(String[] args) {

        /*
            r=6,371.0 is the mean radius of the Earth (in kilometers).
        */

        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double x1rad = Math.toRadians(x1);
        double y1rad = Math.toRadians(y1);
        double x2rad = Math.toRadians(x2);
        double y2rad = Math.toRadians(y2);

        double r = 6371.0;
        double det = Math.sqrt( Math.pow(Math.sin((x2rad - x1rad) / 2), 2) + Math.cos(x1rad) * Math.cos(x2rad) * Math.pow(Math.sin((y2rad - y1rad) / 2), 2) );
        double distance = 2 * r * Math.asin(det);

        System.out.println(distance + " kilometers");
    }
}