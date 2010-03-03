package net.wolfgangwerner.geo.distance;

import net.wolfgangwerner.geo.model.GeoPoint;

public interface DistanceCalculationAlgorithm {
	public double calculateDistance(GeoPoint from, GeoPoint to);
}