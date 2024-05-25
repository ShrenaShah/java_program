import java.util.ArrayList;
import java.util.Collections;

class Operation
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(4);
        list.add(23);
        list.add(5);  
        
        System.out.println(list);

        System.out.println(list.get(0));

        list.add(1,20);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0; i<list.size(); i++)
        {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        Collections.sort(list);
        System.out.println(list);
    }
}