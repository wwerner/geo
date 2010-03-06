package net.wolfgangwerner.geo.distance;

import static net.wolfgangwerner.geo.GeoConstants.DEFAULT_ALGORITHM;
import net.wolfgangwerner.geo.model.GeoPoint;

/**
 * Performs distance calculations between two locations.
 * The calculation strategy can be changed.
 * 
 * @author wwerner
 */
public class DistanceCalculator {

	private DistanceCalculationAlgorithm algorithm = DEFAULT_ALGORITHM;

	public DistanceCalculator() {
		super();
	}

	public DistanceCalculator(DistanceCalculationAlgorithm algorithm) {
		super();
		this.algorithm = algorithm;
	}

	public void setAlgorithm(DistanceCalculationAlgorithm algorithm) {
		this.algorithm = algorithm;
	}

	public double distanceInKilometres(GeoPoint from, GeoPoint to) {
		return this.algorithm.distanceInKilometres(from, to);
	}
}
