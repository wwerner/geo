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
	public void testEqual() {
		GeoPoint p1 = new GeoPoint(10.23023, 34.234934);
		GeoPoint p2 = new GeoPoint(10.23023, 34.234934);

		assertEquals(p1, p2);
	}

	@Test
	public void testNotEqual() {
		GeoPoint p1 = new GeoPoint(45.23023, 9.234934);
		GeoPoint p2 = new GeoPoint(10.23023, 34.234934);

		assertFalse(p1.equals(p2));
	}

	@Test
	public void testSameHashCode() {
		GeoPoint p1 = new GeoPoint(10.23023, 34.234934);
		GeoPoint p2 = new GeoPoint(10.23023, 34.234934);

		assertEquals(p1.hashCode(), p2.hashCode());
	}

	@Test
	public void testNotSameHashCode() {
		GeoPoint p1 = new GeoPoint(45.23023, 9.234934);
		GeoPoint p2 = new GeoPoint(10.23023, 34.234934);

		assertFalse(p1.hashCode() == p2.hashCode());
	}

}
