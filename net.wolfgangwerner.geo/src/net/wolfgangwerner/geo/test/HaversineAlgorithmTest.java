package net.wolfgangwerner.geo.test;

import static org.junit.Assert.assertEquals;
import net.wolfgangwerner.geo.distance.DistanceCalculationAlgorithm;
import net.wolfgangwerner.geo.distance.HaversineAlgorithm;
import net.wolfgangwerner.geo.model.GeoPoint;

import org.junit.Test;

public class HaversineAlgorithmTest {
	GeoPoint berlin = new GeoPoint(52.533333, 13.416667);
	GeoPoint zurich = new GeoPoint(47.35, 8.516667);

	@Test
	public void testCalculateDistance() {
		double expectedDistance = 673.8330728458027;

		DistanceCalculationAlgorithm alg = new HaversineAlgorithm();
		double result = alg.calculateDistance(berlin, zurich);

		assertEquals(expectedDistance, result, 1);
	}

	@Test
	public void testCalculateReverseDistance() {
		double expectedDistance = 673.8330728458027;

		DistanceCalculationAlgorithm alg = new HaversineAlgorithm();
		double result = alg.calculateDistance(zurich, berlin);

		assertEquals(expectedDistance, result, 1);
	}

}
