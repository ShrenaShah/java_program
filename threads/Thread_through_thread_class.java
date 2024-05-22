import java.util.Scanner;

class ThreadThroughThreadClass extends Thread
{
    public void run()
    {
        for(int i=19; i>=0; i--)
        {
            System.out.println("value of i in reverce is: " + i);

            try
            {
                Thread.sleep(2000);
            }
            catch(Exception e){}
        }
    }

    public static void main(String args[])
    {
        ThreadThroughThreadClass t1 = new ThreadThroughThreadClass();
        t1.start();
    }
}