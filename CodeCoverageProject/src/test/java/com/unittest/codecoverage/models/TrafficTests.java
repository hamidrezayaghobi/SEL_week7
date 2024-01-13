package com.unittest.codecoverage.models;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrafficTests {
    @Test
    public void testTraffic_shouldSetAndGetTrafficFlowCorrectly() {
        Traffic traffic = new Traffic();
        traffic.setStreetDirectionFlow(StreetDirectionFlow.ONE_WAY);

        Assertions.assertThat(traffic.getStreetDirectionFlow()).isEqualTo(StreetDirectionFlow.ONE_WAY);
    }

    @Test
    public void testTraffic_shouldSetAndGetTrafficLight() {
        Traffic traffic = new Traffic();
        traffic.setCurrentTrafficLight(TrafficLigth.GREEN);

        Assertions.assertThat(traffic.getCurrentTrafficLight()).isEqualTo(TrafficLigth.GREEN);
    }

    @Test
    public void testTraffic_shouldSetAndGetMaxSpeedAllowed() {
        Traffic traffic = new Traffic();
        traffic.setMaxSpeedAllowed((short) 3);

        Assertions.assertThat(traffic.getMaxSpeedAllowed()).isEqualTo((short) 3);
    }

    @Test
    public void testTraffic_shouldSetAndGetMinSpeedAllowed() {
        Traffic traffic = new Traffic();
        traffic.setMinSpeedAllowed((short) 3);

        Assertions.assertThat(traffic.getMinSpeedAllowed()).isEqualTo((short) 3);
    }
}