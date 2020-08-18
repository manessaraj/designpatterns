package revision.v1.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements IPublisher {

    private List<ISubscriber> listeners;
    private Integer previousValue;
    private Integer currentValue;

    public Publisher() {
        this.listeners = new ArrayList<>();
    }

    public void updateValue(Integer val) {
        previousValue = currentValue;
        currentValue = val;
        onChange();
    }

    @Override
    public Integer previousValue() {
        return previousValue;
    }

    @Override
    public Integer currentValue() {
        return currentValue;
    }

    @Override
    public void register(ISubscriber subscriber) {
        listeners.add(subscriber);
    }

    @Override
    public void deregister(ISubscriber subscriber) {
        listeners.remove(subscriber);
    }

    @Override
    public void onChange() {
        listeners.stream().forEach(listener -> {
            listener.listen(this);
        });
    }
}
