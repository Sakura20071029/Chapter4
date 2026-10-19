public class Test4_3 {
    public static void main(String[] args){
        double atlantaX = 33.7489954;
        double atlantaY = -84.3879824;

        double orlandoX = 28.5383355;
        double orlandoY = -81.3792365;

        double savannahX = 32.0835407;
        double savannahLY = -81.0998342;

        double charlotteX = 35.2270869;
        double charlotteY = -80.8431267;

        final double RADIUS = 6371.01;

        double line1 = RADIUS * Math.acos(Math.sin(Math.toRadians(atlantaX)) * Math.sin(Math.toRadians(orlandoX)) + Math.cos(Math.toRadians(atlantaX)) * Math.cos(Math.toRadians(orlandoX)) * Math.cos(Math.toRadians(atlantaY - orlandoY)));
        double line2 = RADIUS * Math.acos(Math.sin(Math.toRadians(orlandoX)) * Math.sin(Math.toRadians(savannahX)) + Math.cos(Math.toRadians(orlandoX)) * Math.cos(Math.toRadians(savannahX)) * Math.cos(Math.toRadians(orlandoY - savannahLY)));
        double line3 = RADIUS * Math.acos(Math.sin(Math.toRadians(atlantaX)) * Math.sin(Math.toRadians(savannahX)) + Math.cos(Math.toRadians(atlantaX)) * Math.cos(Math.toRadians(savannahX)) * Math.cos(Math.toRadians(atlantaY - savannahLY)));
        double line4 = RADIUS * Math.acos(Math.sin(Math.toRadians(savannahX)) * Math.sin(Math.toRadians(charlotteX)) + Math.cos(Math.toRadians(savannahX)) * Math.cos(Math.toRadians(charlotteX)) * Math.cos(Math.toRadians(savannahLY - charlotteY)));
        double line5 = RADIUS * Math.acos(Math.sin(Math.toRadians(atlantaX)) * Math.sin(Math.toRadians(charlotteX)) + Math.cos(Math.toRadians(atlantaX)) * Math.cos(Math.toRadians(charlotteX)) * Math.cos(Math.toRadians(atlantaY - charlotteY)));

        double s1 = (line1 + line2 + line3) / 2;
        double area1 = Math.sqrt(s1 * (s1 - line1) * (s1 - line2) * (s1 - line3));

        double s2 = (line3 + line4 + line5) / 2;
        double area2 =Math.sqrt(s2 * (s2 - line3) * (s2 - line4) * (s2 - line5));

        double totalArea = area1 + area2;
        System.out.printf("The estimated area is %.2fsquare km", totalArea);

    }
}
