import java.util.TreeSet;

class Operation
{
    public static void main(String args[])
    {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(6);
        set.add(23);
        set.add(7);

        System.out.println(set);

        set.remove(6);
        System.out.println(set);
        
        set.clear();
        System.out.println(set);
    }
}