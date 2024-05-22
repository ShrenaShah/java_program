class ThreadOperation
{
    public static void main(String args[])
    {
        Thread t1 = Thread.currentThread(); // for getting nformation about current Thread
        String thread_name = t1.getName(); // for getting name of current Thread
        System.out.println("Name of current Thread is: " + thread_name);

        t1.setName("myMain"); // for changing name of current Thread
        System.out.println("New Name of current Thread is : " + t1.getName());

        System.out.println("ID of current Thread is : " + t1.getId());//for getting ID

        try
        {
            Thread.sleep(5000); /* for make thread sleep for a seconds while 
                                other thread can continue there work*/
        }
        catch(Exception e){}

        Sample t2 = new Sample();
        t2.start(); // for starting the thread
    }
}

class Sample extends Thread
{
    public void run()
    {
        System.out.println("This is the example of start method");
    }
}