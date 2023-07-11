package org.Tasks.Functional.Streams.Planets;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


class PlanetTest {

    private List<Planet> planets = SolarSystem.getPlanets();
    private PlanetUtils planetUtils = new PlanetUtils();


    @Test
    void testTwoPlanetsStartWithM() {
        List<Planet> actual = planetUtils.getPlanetsBeginningWithM(planets);
        assertEquals(2, actual.size());
        assertTrue(actual.stream().map(Planet::getName).collect(Collectors.toList())
                .containsAll(Arrays.asList("Mercury", "Mars")));
    }

    @Test
    void testFourPlanetsHaveRings() {
        List<Planet> actual = planetUtils.getPlanetsWithRings(planets);
        assertEquals(4, actual.size());
        assertTrue(actual.stream().map(Planet::getName).collect(Collectors.toList())
                .containsAll(Arrays.asList("Jupiter", "Saturn", "Uranus", "Neptune")));
    }

    @Test
    void testFourPlanetsHaveMoreThanThreeMoons() {
        List<Planet> actual = planetUtils.getPlanetsWithMoreThanThreeMoons(planets);
        assertEquals(4, actual.size());
        assertTrue(actual.stream().map(Planet::getName).collect(Collectors.toList())
                .containsAll(Arrays.asList("Jupiter", "Saturn", "Uranus", "Neptune")));
    }

    @Test
    void testThreePlanetsWithDensityGreaterThanFive() {
        List<Planet> actual = planetUtils.getPlanetsWithDensityGreaterThanFive(planets);
        assertEquals(3, actual.size());
        assertTrue(actual.stream().map(Planet::getName).collect(Collectors.toList())
                .containsAll(Arrays.asList("Mercury", "Venus", "Earth")));
    }


}