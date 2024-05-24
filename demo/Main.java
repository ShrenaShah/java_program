class Main 
{
    public static void main(String args[])
    {
        DefiningGenerics<Integer> a = new DefiningGenerics<>();
        a.set(10);
        System.out.println("value: " + a.get());
    }
}
