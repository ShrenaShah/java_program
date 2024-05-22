/*println takes only one parameter if you want to pass more than one than you need to
make it as a string*/
/* static function only take static variable and non static function can take any kind
of variable 
static function can only call by class name and non static function can call by object*/

import java.util.Scanner;

class StaticAndNonstaticMethod
{
    int a = 10;
    static int b = 20;
    public static void main(String args[])
    {
        StaticAndNonstaticMethod r = new StaticAndNonstaticMethod();
        StaticAndNonstaticMethod.B();
        r.C();
    }
    static void B()
    {
        System.out.println(b);
    }

    void C()
    {
        System.out.println("a: " + a + " and b: " + b);
    }
}