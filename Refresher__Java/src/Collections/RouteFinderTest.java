package Collections;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class RouteFinderTest {

	@Test
	public void testScenario1() {
		RouteFinder rf = new RouteFinder();
		ArrayList<String> alResult = rf.getRoute("Trichy", "Chennai");
		assertNotEquals(null, alResult);
		assertEquals("trichy", alResult.get(0));
		assertEquals("banglore", alResult.get(1));
		assertEquals("chennai", alResult.get(2));	
	}
	@Test
	public void testScenario2() {
		RouteFinder rf = new RouteFinder();
		ArrayList<String> alResult = rf.getRoute("nellai", "kashmir");
		assertNotEquals(null, alResult);	
		System.out.println(alResult);
	}
}
