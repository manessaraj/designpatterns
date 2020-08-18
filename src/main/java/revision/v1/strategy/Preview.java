package revision.v1.strategy;

import java.util.Map;

public abstract class Preview {

    protected Map<String, Integer> statitics;



    public Map<String, Integer> getPreview() {
        if (statitics == null) {
            this.computeStats();
        }
        return statitics;
    }

    abstract void computeStats();
}
