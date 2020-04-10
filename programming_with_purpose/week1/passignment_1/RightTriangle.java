public class RightTriangle {

    public static void main(String[] args) {
        int side1 = Integer.parseInt(args[0]);
        int side2 = Integer.parseInt(args[1]);
        int side3 = Integer.parseInt(args[2]);

        
        
        int maxSide = Math.max(Math.max(side1, side2), side3);
        int maxSquared = maxSide * maxSide;
        
        System.out.println(!(side1 < 0 || side2 < 0 || side3 < 0) && (side1 * side1 + side2 * side2 == maxSquared || side2 * side2 + side3 * side3 == maxSquared || side1 * side1 + side3 * side3 == maxSquared));
    }
}
