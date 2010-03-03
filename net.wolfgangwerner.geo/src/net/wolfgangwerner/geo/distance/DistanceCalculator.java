package net.wolfgangwerner.geo.distance;

import net.wolfgangwerner.geo.model.GeoPoint;

public class DistanceCalculator {
	private DistanceCalculationAlgorithm algorithm = new HaversineAlgorithm();

	public DistanceCalculator() {
		super();
	}

	public DistanceCalculator(DistanceCalculationAlgorithm algorithm) {
		super();
		this.algorithm = algorithm;
	}

	public double calculateDistance(GeoPoint from, GeoPoint to) {
		return this.algorithm.calculateDistance(from, to);
	}
}
