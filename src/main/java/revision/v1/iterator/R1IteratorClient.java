package revision.v1.iterator;

public class R1IteratorClient {

    public static void main(String [] args) {
        AContainer container = new AContainer();
        container.add(1);
        container.add(2);
        container.add(3);
        AIterator<Integer> iterator = container.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
