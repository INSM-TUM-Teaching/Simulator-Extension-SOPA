package cost_driver;

import org.deckfour.xes.model.XAttribute;

import java.util.*;

public class CostVariant {

    protected String id;
    protected Double frequency;
    protected Map<String, Double> concretisedACD;

    public CostVariant(String id, Double frequency, Map<String, Double> concretisedACD) {
        this.concretisedACD = concretisedACD;
        this.frequency = frequency;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public Double getFrequency() {
        return frequency;
    }

    public Map<String, Double> getConcretisedACD() {
        return concretisedACD;
    }
}
