public class MyClass implements Comparable<MyClass>
{
    int value;
    public void putValue(int value)
    {
        this.value = value;
    }
    public int getValue()
    {
        return value;
    }

    public int compareTo(MyClass other)
    {
        return Integer.compare(this.value, other.value);
    }
}
