import static java.lang.Math.PI;

public class exercise2 {
    public static void main (String [] args){
        //3.3.1
        int y = 123456, x = 0;
        if (y > 0){
            ++x;
        }
        System.out.println(x);

        //3.3.2
        int pay = 15400;
        int scr = 91;
        if (scr > 90){
            System.out.println(pay*3/100 + pay);
        }

        //3.3.3
        double area = 0.0, radius = 9.0;

        if (radius >=0)
        {
                area = radius * radius * PI;
                System.out.println("The area for the circle of " +
                 "radius " + radius + " is" + area);
        }
    }
}
