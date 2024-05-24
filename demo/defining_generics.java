class DefiningGenerics<T>
{
    private T num;
    public void set(T num)
    {
        this.num = num;
    }

    public T get()
    {
        return num;
    }
}