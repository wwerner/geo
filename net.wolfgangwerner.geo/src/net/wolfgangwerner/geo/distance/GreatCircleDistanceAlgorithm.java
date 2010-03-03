package net.wolfgangwerner.geo.distance;

import static net.wolfgangwerner.geo.GeoConstants.EARTH_RADIUS_IN_KM;
import net.wolfgangwerner.geo.model.GeoPoint;

public class GreatCircleDistanceAlgorithm implements
		DistanceCalculationAlgorithm {

	@Override
	public double distanceInKilometres(GeoPoint from, GeoPoint to) {

		double d = Math.acos((Math.cos(from.getLatitudeRadians()) * Math.cos(to
				.getLatitudeRadians()))
				+ (Math.sin(from.getLatitudeRadians()) * Math.sin(to
						.getLatitudeRadians()))
				* (Math.cos(from.getLongitudeRadians()
						- to.getLongitudeRadians())));
		return (d * EARTH_RADIUS_IN_KM);
	}

}
