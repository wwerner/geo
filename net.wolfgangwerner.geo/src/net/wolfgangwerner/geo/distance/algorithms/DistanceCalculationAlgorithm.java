package net.wolfgangwerner.geo.distance.algorithms;

import net.wolfgangwerner.geo.model.GeoPoint;

public interface DistanceCalculationAlgorithm {
	public double distanceInKilometres(GeoPoint from, GeoPoint to);
}