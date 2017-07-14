package module06.BIterator;

/**
 * Created by tetya on 10.07.2017.
 */
public class ConcreteCollection implements Collection {

    String[] books = {  "Java 8 Полное руководство",
                        "Java Language Specification 8",
                        "Java Virtual Machine Specification 8",
                        "Алгоритмы Java"};

    @Override
    public Iterator getIterator() {
        return new IteratorOfCollection();
    }

    private class IteratorOfCollection implements Iterator {

        int index = 0; //перший елемент

        @Override
        public Object first() {
            return books[0];
        }

        @Override
        public boolean hasNext() {
            if (index < books.length)
                return true;
            else return false;
        }

        @Override
        public Object next() {
            return books[index++];
        }
    }
}
