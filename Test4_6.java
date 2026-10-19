public class Test4_6 {
    public static void main(String[] args){
        double radius = 40.0;

        double a1 = Math.random() * 2 * Math.PI;
        double a2 = Math.random() * 2 * Math.PI;
        double a3 = Math.random() * 2 * Math.PI;

        double x1 = radius * Math.cos(a1);
        double y1 = radius * Math.sin(a1);

        double x2 = radius * Math.cos(a2);
        double y2 = radius * Math.sin(a2);

        double x3 = radius * Math.cos(a3);
        double y3 = radius * Math.sin(a3);

        double side1 = Math.sqrt((x1 - x2) * (x1 -x2) + (y1 -y2) * (y1 - y2));
        double side2 = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double side3 = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 -y3));

        double radians1 = Math.acos((side1 * side1 + side2 * side2 - side3 *side3) / (2 * side1 * side2));
        double radians2 = Math.acos((side1 * side1 + side3 * side3 - side2 *side2) / (2 * side1 * side3));
        double radians3 = Math.acos((side2 * side2 + side3 *side3 - side1 * side1) / (2 * side2 * side3));

        double degrees1 = Math.toDegrees(radians1);
        double degrees2 = Math.toDegrees(radians2);
        double degrees3 = Math.toDegrees(radians3);

        System.out.printf("The three degrees are %.3f %.3f %.3f" ,degrees1, degrees2, degrees3);


    }
}
