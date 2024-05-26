import java.util.LinkedHashSet;
class MyLinkedHashSet  
{
    public static void main(String[] args) 
    {
        LinkedHashSet<Integer> set = new LinkedHashSet<>(); 
        
        set.add(2);
        set.add(56);
        set.add(27);
        set.add(7);

        System.out.println(set);
    }
}
