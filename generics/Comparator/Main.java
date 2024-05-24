import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Main 
{
    public static void main(String[] args) 
    {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Shrena",18));
        people.add(new Person("Riya",20));
        people.add(new Person("Mittal",19));

        Collections.sort(people, new AgeComparator());

        for(Person person : people)
        {
            System.out.println(person);
        }
    }
}
