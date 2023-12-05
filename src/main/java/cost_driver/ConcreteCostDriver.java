package cost_driver;

import de.hpi.bpt.scylla.exception.ScyllaValidationException;
import de.hpi.bpt.scylla.model.configuration.distribution.TimeDistributionWrapper;

import javax.xml.datatype.Duration;

public class ConcreteCostDriver extends costDriver{
    protected costDriver parent;
    protected Double probability;
    protected Double LCAScore;
    protected TimeDistributionWrapper duration;

    public ConcreteCostDriver(String id, costDriver parent, Double probability, Double LCAScore, TimeDistributionWrapper duration) throws ScyllaValidationException {
        super(id);
        if (parent instanceof AbstractCostDriver) {
            this.parent = parent;
        } else { throw new ScyllaValidationException("Parent cost driver is not abstract");}

        this.duration = duration;
        this.LCAScore = LCAScore;
        this.probability = probability;
    }

    public Double getProbability() {
        return probability;
    }

    public Double getLCAScore() {
        return LCAScore;
    }

    public TimeDistributionWrapper getDuration() {
        return duration;
    }

    public costDriver getParent() {
        return parent;
    }
}