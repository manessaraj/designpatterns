package revision.v1.observer;

public interface IPublisher<T> {
    void register(ISubscriber subscriber);
    void deregister(ISubscriber subscriber);
    void onChange();
    T previousValue();
    T currentValue();
}
