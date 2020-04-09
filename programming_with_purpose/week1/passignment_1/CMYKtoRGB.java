/*
CMYK = cyan, magenta, yello, black

white = 1 - black
*/

public class CMYKtoRGB {

    public static void main(String[] args) {
        
        double c = Double.parseDouble(args[0]);
        double m = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);
        double k = Double.parseDouble(args[3]);


        double white = 1 - k;

        int red = (int) Math.round(255 * white * (1 - c));
        int green = (int) Math.round(255 * white * (1 - m));
        int blue = (int) Math.round(255 * white * (1 - y));

        System.out.println("red   = " + red);
        System.out.println("green = " + green);
        System.out.println("blue  = " + blue);
    }
}