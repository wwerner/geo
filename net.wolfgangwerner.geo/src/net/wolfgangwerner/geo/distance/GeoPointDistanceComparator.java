package net.wolfgangwerner.geo.distance;

import java.util.Comparator;

import net.wolfgangwerner.geo.model.GeoPoint;

public class GeoPointDistanceComparator implements Comparator<GeoPoint> {

	private GeoPoint toPoint;
	private DistanceCalculator distanceCalculator;

	public GeoPointDistanceComparator(GeoPoint toPoint) {
		this(toPoint, new DistanceCalculator());
	}

	public GeoPointDistanceComparator(GeoPoint toPoint,
			DistanceCalculator distanceCalculator) {
		super();
		this.toPoint = toPoint;
		this.distanceCalculator = distanceCalculator;
	}

	@Override
	public int compare(GeoPoint p1, GeoPoint p2) {
		if (distanceCalculator.distanceInKilometres(toPoint, p1) < distanceCalculator
				.distanceInKilometres(toPoint, p2))
			return -1;
		if (distanceCalculator.distanceInKilometres(toPoint, p1) > distanceCalculator
				.distanceInKilometres(toPoint, p2))
			return 1;
		return 0;
	}

}
