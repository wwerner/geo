package net.wolfgangwerner.geo;

import net.wolfgangwerner.geo.distance.HaversineAlgorithm;
import net.wolfgangwerner.geo.distance.algorithms.DistanceCalculationAlgorithm;
import net.wolfgangwerner.geo.distance.algorithms.GreatCircleDistanceAlgorithm;

public class GeoConstants {
	public static double EARTH_RADIUS_IN_KM = 6371;
	
	public static DistanceCalculationAlgorithm HAVERSINE_ALGORITHM = new HaversineAlgorithm();
	public static DistanceCalculationAlgorithm GREAT_CIRCLE_ALGORITHM = new GreatCircleDistanceAlgorithm();
	
	public static DistanceCalculationAlgorithm DEFAULT_ALGORITHM = HAVERSINE_ALGORITHM;
}
