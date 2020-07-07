package bridge;

//A refined abstraction.
public class Queue<T> implements FifoCollection<T>{

    // The Implementor
    private LinkedList<T> implementorList;

    public Queue(LinkedList<T> linkedList) {
        this.implementorList = linkedList;
    }

    @Override
    public void offer(T element) {
        implementorList.addLast(element);
    }

    @Override
    public T poll() {
        return implementorList.removeFirst();
    }
}
