public class AreaCalculator {

    public static void main(String[] args) {
        area(5.0);
        area(5.0, 4.0);
    }

    public static double area(double radius){
        if(radius >= 0){
            double pi = 3.14159265359;
            double areaOfCircle = pi * radius * radius;
            System.out.println(areaOfCircle);
            return  areaOfCircle;
        }
        return -1;
    }

    public static double area(double x, double y){
        if((x >= 0 || y >= 0) && (x >= 0 && y >= 0)){
            double areaOfRectangle = x * y;
            System.out.println(areaOfRectangle);
            return areaOfRectangle;
        }
        return  -1;
    }
}
