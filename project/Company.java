class Company 
{
    int n;
    boolean f = false;

    synchronized public void producer(int n) throws Exception 
    {
        if (f) 
        {
            wait();
        }
        this.n = n;
        System.out.println("Producer: " + this.n);
        f = true;
        notify();
    }

    synchronized public void consumer(int n) throws Exception 
    {
        if (!f) 
        {
            wait();
        }
        this.n = n;
        System.out.println("Consumer: " + this.n);
        f = false;
        notify();
    }
}