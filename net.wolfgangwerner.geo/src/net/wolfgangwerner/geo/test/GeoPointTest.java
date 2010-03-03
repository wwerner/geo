package net.wolfgangwerner.geo.test;

import static org.junit.Assert.*;

import net.wolfgangwerner.geo.model.GeoPoint;

import org.junit.Test;

public class GeoPointTest {


	@Test
	public void testGetLatitude() {
		double lat = 46.875;
		GeoPoint p = new GeoPoint(lat, 0);
		assertEquals(lat, p.getLatitude(), 0.001);
	}
	
	@Test
	public void testGetLatitudeRadians() {
		double lat = 46.875;
		GeoPoint p = new GeoPoint(lat, 0);
		assertEquals(Math.toRadians(lat), p.getLatitudeRadians(), 0.00001);
	}

	@Test
	public void testSetLatitude() {
		double lat = 46.876;
		GeoPoint p = new GeoPoint(0, 0);
		p.setLatitude(lat);
		assertEquals(lat, p.getLatitude(), 0.001);
	}

	@Test
	public void testGetLongitude() {
		double lon = 46.875;
		GeoPoint p = new GeoPoint(0, lon);
		assertEquals(lon, p.getLongitude(), 0.001);
	}

	@Test
	public void testGetLongitudeRadians() {
		double lon = 46.875;
		GeoPoint p = new GeoPoint(0, lon);
		assertEquals(Math.toRadians(lon), p.getLongitudeRadians(), 0.00001);
	}
	
	@Test
	public void testSetLongitude() {
		double lon = 46.875;
		GeoPoint p = new GeoPoint(0, 0);
		p.setLongitude(lon);
		assertEquals(lon, p.getLongitude(), 0.001);
	}
	
	@Test
	public void testDistanceTo() {
		GeoPoint berlin = new GeoPoint(52.533333, 13.416667);
		GeoPoint zurich = new GeoPoint(47.35, 8.516667);
		double expectedDistance = 673.8330728458027;
		
		assertEquals(expectedDistance, berlin.distanceInKilometresTo(zurich),1);
	}

}
