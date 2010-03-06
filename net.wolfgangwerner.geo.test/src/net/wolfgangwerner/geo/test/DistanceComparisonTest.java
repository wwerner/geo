package net.wolfgangwerner.geo.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Comparator;

import net.wolfgangwerner.geo.GeoConstants;
import net.wolfgangwerner.geo.distance.DistanceCalculator;
import net.wolfgangwerner.geo.distance.GeoPointDistanceComparator;
import net.wolfgangwerner.geo.distance.algorithms.DistanceCalculationAlgorithm;
import net.wolfgangwerner.geo.model.GeoPoint;

import org.junit.Test;

public class DistanceComparisonTest {
	GeoPoint berlin = new GeoPoint(52.533333, 13.416667);
	GeoPoint zurich = new GeoPoint(47.35, 8.516667);
	GeoPoint munich = new GeoPoint(48.1500, 11.5833);
	GeoPoint stuttgart = new GeoPoint(48.7667, 9.1833);

	@Test
	public void testFurtherAway() {
		Comparator<GeoPoint> toPointComparator = new GeoPointDistanceComparator(
				stuttgart);
		assertEquals(1, toPointComparator.compare(berlin, munich));
	}

	@Test
	public void testNearer() {
		Comparator<GeoPoint> toPointComparator = new GeoPointDistanceComparator(
				stuttgart);
		assertEquals(-1, toPointComparator.compare(munich, berlin));
	}

	@Test
	public void testEqual() {
		Comparator<GeoPoint> toPointComparator = new GeoPointDistanceComparator(
				stuttgart);
		assertEquals(0, toPointComparator.compare(munich, munich));
	}

	@Test
	public void testSortArray() {
		GeoPoint[] increasingDistanceToZurich = new GeoPoint[] { stuttgart,
				munich, berlin };
		GeoPoint[] shuffelled = new GeoPoint[] { munich, stuttgart, berlin };

		Arrays.sort(shuffelled, new GeoPointDistanceComparator(zurich));

		assertArrayEquals(shuffelled, increasingDistanceToZurich);
	}

	@Test
	public void testSortArrayWithGreatCircleAlg() {
		GeoPoint[] increasingDistanceToZurich = new GeoPoint[] { stuttgart,
				munich, berlin };
		GeoPoint[] shuffelled = new GeoPoint[] { munich, stuttgart, berlin };

		Arrays.sort(shuffelled, new GeoPointDistanceComparator(zurich,
				new DistanceCalculator(GeoConstants.GREAT_CIRCLE_ALGORITHM)));

		assertArrayEquals(shuffelled, increasingDistanceToZurich);
	}

}
