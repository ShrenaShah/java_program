import java.util.*;

class ListIterator
{
    public static void main(String[] args) 
    {
        LinkedList<String> list = new LinkedList<>();
        
        list.add("Shrena");
        list.add("Mittal");
        list.add("Riya");
        list.add("Radhika");

        Iterator<String> itr =list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}