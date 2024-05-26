import java.util.HashSet;
import java.util.Iterator;

class Operation
{
    public static void main(String[] args) 
    {
        HashSet<Integer> set = new HashSet<>();
        
        set.add(23);
        set.add(7);
        set.add(20);
        set.add(5);
        set.add(1);

        System.out.println(set.size());
        if(set.contains(7))
        {
            System.out.println("present");
        }
        set.remove(1);
        System.out.println(set);

        if(set.isEmpty())
        {
            System.out.println("This set is empty");
        }
        else
        {
            System.out.println("SET " + set);
        }
    }
}