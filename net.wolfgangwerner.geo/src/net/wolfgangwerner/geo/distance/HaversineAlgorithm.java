package net.wolfgangwerner.geo.distance;

import static net.wolfgangwerner.geo.GeoConstants.EARTH_RADIUS_IN_KM;
import net.wolfgangwerner.geo.distance.algorithms.DistanceCalculationAlgorithm;
import net.wolfgangwerner.geo.model.GeoPoint;

public class HaversineAlgorithm implements DistanceCalculationAlgorithm {

	@Override
	public double distanceInKilometres(GeoPoint from, GeoPoint to) {
		double lat1 = from.getLatitude();
		double lat2 = to.getLatitude();
		double lon1 = from.getLongitude();
		double lon2 = to.getLongitude();
		
		double dLat = Math.toRadians(lat2 - lat1);
		double dLon = Math.toRadians(lon2 - lon1);
		double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
				+ Math.cos(Math.toRadians(lat1))
				* Math.cos(Math.toRadians(lat2)) * Math.sin(dLon / 2)
				* Math.sin(dLon / 2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		return EARTH_RADIUS_IN_KM * c;
	}

}
