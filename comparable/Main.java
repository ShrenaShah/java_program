class Main 
{
    public static void main(String args[])
    {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();

        obj1.putValue(5);
        obj2.putValue(10);

        if(obj1.compareTo(obj2) < 0)
        {
            System.out.println("obj 1 is less than obj2");
        }
        else if(obj1.compareTo(obj2) > 0)
        {
            System.out.println("obj 1 is greater than obj2");
        }
        else
        {
            System.out.println("obj1 is equal to obj2");
        }
    }
}
