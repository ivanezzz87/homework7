package belhard.java28;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Person> arrayList = new ArrayList<> ();
        arrayList.add ( new Person ( "Mike", "Tyson", Gender.MALE ));
        arrayList.add ( new Person ( "Muhammad", "Ali", Gender.MALE ));
        arrayList.add ( new Person ( "Muhammad", "Ali", Gender.MALE ));
        arrayList.add ( new Person ( "Laila", "Ali", Gender.FEMALE ));
        arrayList.add ( new Person ( "Holly", "Holm", Gender.FEMALE ));
        printCollection ( arrayList );
        Set<Person> setCollection = new HashSet<> ();
        setCollection.add ( new Person ( "David", "Beckham", Gender.MALE ) );
        setCollection.add ( new Person ( "Paul", "Scholes", Gender.MALE ) );
        setCollection.add ( new Person ( "David", "Beckham", Gender.MALE ) );
        setCollection.add ( new Person ( "George", "Best", Gender.MALE ) );
        setCollection.add ( new Person ( "George", "Best", Gender.MALE ) );
        printCollection ( setCollection );
        Map<Integer, Person> mapCollection = new HashMap<> ();
        mapCollection.put ( 5, new Person ( "Mick", "Jagger", Gender.MALE ) );
        mapCollection.put ( 6, new Person ( "Brian", "Johnson", Gender.MALE ) );
        mapCollection.put ( 3, new Person ( "Klaus", "Meine", Gender.MALE ) );
        mapCollection.put ( 1, new Person ( "Janis", "Joplin", Gender.FEMALE ) );
        mapCollection.put ( 8, new Person ( "Hayley", "Williams", Gender.FEMALE ) );
        System.out.println ("Elements in collection - " + mapCollection.size ());
        for (Integer key : mapCollection.keySet ()){
            System.out.println (key + " - " + mapCollection.get ( key ));
        }
    }
    private static void printCollection (Collection collection){
        System.out.println ("Elements in collection - " + collection.size ());
        for (Object per : collection){
            System.out.println (per.toString ());
        }
    }
}
