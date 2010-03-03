package net.wolfgangwerner.geo.model;

import net.wolfgangwerner.geo.distance.DistanceCalculationAlgorithm;
import static net.wolfgangwerner.geo.GeoConstants.DEFAULT_ALGORITHM;

public class GeoPoint {
	double latitude;
	double longitude;

	public GeoPoint(double latitude, double longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLatitudeRadians() {
		return Math.toRadians(latitude);
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public double getLongitudeRadians() {
		return Math.toRadians(longitude);
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double distanceInKilometresTo(GeoPoint to,
			DistanceCalculationAlgorithm algorithm) {
		return algorithm.distanceInKilometres(this, to);
	}

	public double distanceInKilometresTo(GeoPoint to) {
		return DEFAULT_ALGORITHM.distanceInKilometres(this, to);
	}

}
