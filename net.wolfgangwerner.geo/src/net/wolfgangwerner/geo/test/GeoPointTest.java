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
	public void testSetLongitude() {
		double lon = 46.875;
		GeoPoint p = new GeoPoint(0, 0);
		p.setLongitude(lon);
		assertEquals(lon, p.getLongitude(), 0.001);
	}

}
