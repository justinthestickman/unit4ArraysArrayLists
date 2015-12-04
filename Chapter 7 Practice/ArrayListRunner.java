import java.util.ArrayList;

public class ArrayListRunner
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        System.out.println(names);
        names.add("Alice");
        names.add("Bob");
        names.add("Connie");
        names.add("David");
        names.add("Edward");
        names.add("Fran");
        names.add("Gomez");
        names.add("Harry");
        System.out.println("\nUpdated List (names added): " + names);
        System.out.println("\nFirst Name: " + names.get(0));
        System.out.println("Last Name: " + names.get(7));
        System.out.println("\nSize of List: " + names.size());
        names.set(0,"Alice B. Toklas");
        System.out.println("\nUpdated List (Alice changed to Alice B. Toklas): " + names);
        names.add(4,"Doug");
        System.out.println("\nUpdated List (Doug added after David): " + names);
        System.out.println("\nNames:");
        for (String name : names)
        {
           System.out.println(name);
        }
        ArrayList<String> names2 = new ArrayList<String>(names);
        System.out.println("\nNew List: " + names2);
        names.remove(0);
        System.out.println("\nnames (with first name removed): " + names);
        System.out.println("names2: " + names2);
    }
}