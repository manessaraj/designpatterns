package revision.v1.strategy;

import java.util.HashMap;

public class CorrelationPreview extends Preview{
    @Override
    void computeStats() {
        this.statitics = new HashMap<>();
        this.statitics.put("CORRELATION", 2);
    }
}
