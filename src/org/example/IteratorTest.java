package org.example;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<String> movies=new ArrayList<>();
        movies.add("Burning");
        movies.add("Parasite");
        movies.add("Train to Busan");
        movies.add("Taxi Driver");
        Iterator<String> iterator=movies.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        ListIterator<String> listIterator=movies.listIterator(movies.size());
        while (listIterator.hasPrevious())
            System.out.println(listIterator.previous());
    }
}
