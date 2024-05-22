class CombiningBothMethodOfThreadsInOneProgram
{
    public static void main(String args[])
    {
        ThreadThroughRunnableInterface t1 = new ThreadThroughRunnableInterface();
        Thread t2 = new Thread(t1);
        ThreadThroughThreadClass t3 = new ThreadThroughThreadClass();
        t2.start();
        t3.start();
    }
}

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
}

class ThreadThroughThreadClass extends Thread
{
    public void run()
    {
        for(int i=9; i>=0; i--)
        {
            System.out.println("value of i in reverce is: " + i);

            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }
    }
}