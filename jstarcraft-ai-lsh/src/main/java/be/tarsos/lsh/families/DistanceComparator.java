package be.tarsos.lsh.families;

import java.util.Comparator;

import com.jstarcraft.ai.math.structure.vector.MathVector;

/**
 * This comparator can be used to sort candidate neighbours according to their
 * distance to a query vector. Either for linear search or to sort the LSH
 * candidates found in colliding hash bins.
 * 
 * @author Joren Six
 */
public class DistanceComparator implements Comparator<MathVector> {

    private final MathVector query;
    private final DistanceMeasure distanceMeasure;

    /**
     * 
     * @param query           The query vector.
     * @param distanceMeasure The distance vector to use.
     */
    public DistanceComparator(MathVector query, DistanceMeasure distanceMeasure) {
        this.query = query;
        this.distanceMeasure = distanceMeasure;
    }

    @Override
    public int compare(MathVector left, MathVector right) {
        float oneDistance = distanceMeasure.distance(query, left);
        float otherDistance = distanceMeasure.distance(query, right);
        return Float.compare(oneDistance, otherDistance);
    }
}