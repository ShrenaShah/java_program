/*
A thread in Java is like a mini-program running inside a bigger program, allowing 
different tasks to happen at the same time.
*/

import java.util.Scanner;

class ThreadThroughRunnableInterface implements Runnable
{
    public void run()
    {
        for(int i=0; i<=9; i++)
        {
            System.out.println("value of i is: " + i);

            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }
        
    }

    public static void main(String args[])
    {
        ThreadThroughRunnableInterface t1 = new ThreadThroughRunnableInterface();
        Thread t2 = new Thread(t1);
        t2.start();
    }
}