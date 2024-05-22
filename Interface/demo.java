import java.util.Scanner;

class Demo
{
    public static void main(String args[])
    {
        rectangle rect = new rectangle();
        circle c = new circle();
        area a;
        a = rect;
        System.out.println("area of rectangle : " + a.calculate(10,20));
        a = c;
        System.out.println("area of circle: " + a.calculate(10,10));
    }
}

interface area
{
    final static float pi = 3.14f;
    float calculate(float x, float y);
}

class rectangle implements area
{
    public float calculate(float x, float y)
    {
        return x*y;
    }
}

class circle implements area
{
    public float calculate(float x, float y)
    {
        return pi*x*y;
    }
}