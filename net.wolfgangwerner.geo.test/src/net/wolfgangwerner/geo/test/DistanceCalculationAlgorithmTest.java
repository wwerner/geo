package net.wolfgangwerner.geo.test;

import static org.junit.Assert.assertEquals;
import net.wolfgangwerner.geo.distance.HaversineAlgorithm;
import net.wolfgangwerner.geo.distance.algorithms.DistanceCalculationAlgorithm;
import net.wolfgangwerner.geo.distance.algorithms.GreatCircleDistanceAlgorithm;
import net.wolfgangwerner.geo.model.GeoPoint;

import org.junit.Test;

public class DistanceCalculationAlgorithmTest {
	GeoPoint berlin = new GeoPoint(52.533333, 13.416667);
	GeoPoint zurich = new GeoPoint(47.35, 8.516667);
	GeoPoint munich = new GeoPoint(48.1500, 11.5833);
	GeoPoint stuttgart = new GeoPoint(48.7667, 9.1833);

	@Test
	public void testCalculateDistanceHaversine() {
		double expectedDistance = 673.8330728458027;

		DistanceCalculationAlgorithm alg = new HaversineAlgorithm();
		double result = alg.distanceInKilometres(berlin, zurich);

		assertEquals(expectedDistance, result, 1);
	}

	@Test
	public void testCalculateReverseDistanceHaversine() {
		double expectedDistance = 673.8330728458027;

		DistanceCalculationAlgorithm alg = new HaversineAlgorithm();
		double result = alg.distanceInKilometres(zurich, berlin);

		assertEquals(expectedDistance, result, 1);
	}
	
	@Test
	public void testCalculateReverseDistanceHaversine2() {
		double expectedDistance = 189.65;

		DistanceCalculationAlgorithm alg = new HaversineAlgorithm();
		double result = alg.distanceInKilometres(stuttgart, munich);

		assertEquals(expectedDistance, result, 1);
	}
	
	@Test
	public void testCalculateDistanceGreatCircle() {
		double expectedDistance = 673.8330728458027;

		DistanceCalculationAlgorithm alg = new GreatCircleDistanceAlgorithm();
		double result = alg.distanceInKilometres(berlin, zurich);

		assertEquals(expectedDistance, result, 50.0);
	}
	
	@Test
	public void testCalculateDistanceGreatCircle2() {
		double expectedDistance = 189.65;

		DistanceCalculationAlgorithm alg = new GreatCircleDistanceAlgorithm();
		double result = alg.distanceInKilometres(stuttgart, munich);

		assertEquals(expectedDistance, result, 25.00);
	}

}
