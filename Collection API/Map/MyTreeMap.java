import java.util.TreeMap;
class MyTreeMap
{
    public static void main(String args[])
    {
        TreeMap <String,Integer> students = new TreeMap<>();
        students.put("Shrena",7);
        students.put("Mittal",5);

        System.out.println(students);
        System.out.println(students.keySet());
        System.out.println(students.values());
    }
}
