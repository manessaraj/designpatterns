package revision.v1.iterator;

public interface ACollection<T> {
    AIterator<T> iterator();

    void add(T element);

    T getFirst();
}
