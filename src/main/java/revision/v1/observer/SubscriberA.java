package revision.v1.observer;

public class SubscriberA implements ISubscriber {
    @Override
    public void listen(IPublisher publisher) {
        if (publisher.previousValue() != publisher.currentValue()) {
            System.out.println("Hellow workdl");
        }
    }
}
