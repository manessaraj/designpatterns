package revision.v1.observer;

public class SubscriberB implements ISubscriber{
    @Override
    public void listen(IPublisher publisher) {
        if (publisher.previousValue() == null && publisher.currentValue() != null) {
            System.out.println("Component Initialized");
        }
    }
}
