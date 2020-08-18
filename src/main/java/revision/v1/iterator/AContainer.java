package revision.v1.iterator;
import java.util.LinkedList;


public class AContainer implements ACollection<Integer> {

    private LinkedList<Integer> internalStorage = new LinkedList<Integer>();
    @Override
    public AIterator<Integer> iterator() {
        return new AContainerIterator<>();
    }

    @Override
    public void add(Integer element) {

    }

    @Override
    public Integer getFirst() {
        return null;
    }

    private class AContainerIterator<Integer> implements AIterator<Integer> {

        private int index = 0;
        private int size = 0;

        public AContainerIterator() {
            size = internalStorage.size();
        }

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public Integer next() {
            return (Integer) internalStorage.get(index);
        }
    }

}
