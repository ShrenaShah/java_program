class DaemonThread extends Thread
{
    public static void main(String args[])
    {
        Checking t1 = new Checking();
        Checking t2 = new Checking();
        Checking t3 = new Checking(); 
        t1.setDaemon(true); // for setting any thread as a daemon thread
        t1.start();
        t2.start();
        t3.start();
    }
}
class Checking extends Thread
{
    public void run()
    {
        if(Thread.currentThread().isDaemon()) //for checking that the given thread is daemon thread or not
        {
            System.out.println("This is a Daemon Thread");
        }
        else
        {
            System.out.println("This is a Normal Thread");
        }
    }
}