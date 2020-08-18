package revision.v1.strategy;

import java.util.HashMap;

public class DescriptivePreview extends Preview {
    @Override
    void computeStats() {
        this.statitics = new HashMap<>();
        this.statitics.put("ROWS", 23);
        this.statitics.put("COLUMNS", 8);
    }
}
