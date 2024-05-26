import java.util.HashMap;
import java.util.Map;

class Operation
{
    public static void main(String args[])
    {
        Map<String,Integer> students = new HashMap<>();
        students.put("Shrena",7);
        students.put("Mittal",5);

        System.out.println(students);
        System.out.println(students.keySet());
        System.out.println(students.values());
    }
}