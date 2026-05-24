package org.ar.utn.dds.entities;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    @DisplayName("A new client without dispositives, starts with an empty list of dispositives")
    public void testEmptyList(){
        Plan planHome = new HomePlan(100);
        Client client = new Client("Juan","av rivadavia 200","11231241",planHome);

        assertEquals(0,client.getInUseDevices().size());
    }

    @Test
    @DisplayName("A new client with more than 0 dispositives, starts with dispositives in its list")
    public void testListWithElements(){
        List<String> dispositives = List.of("celular1","celular2");
        Plan planHome = new HomePlan(100);
        Client client = new Client("Juan","av rivadavia 200","11231241",planHome,dispositives);

        assertEquals(2,client.getInUseDevices().size());
    }

    @Test
    @DisplayName("A client with a home plan pays a fixedRate")
    public void homePlanClient(){
        Plan planHome = new HomePlan(100);
        Client client = new Client("Juan","av rivadavia 200","11231241",planHome);

        assertEquals(100,client.calculatePrice());
    }

    @Test
    @DisplayName("A client with a commercial plan with more than 0 devices pays a fixedRate and an additional per dispositive")
    public void commercialPlanClientWithDevices() {
        List<String> dispositives = List.of("celular1", "celular2");
        Plan comercialPlan = new CommercialPlan(100, 15);
        Client client = new Client("Juan", "av rivadavia 200", "11231241", comercialPlan, dispositives);

        assertEquals(130, client.calculatePrice());

    }

    @Test
    @DisplayName("A client with a commercial plan with more than 0 devices pays a fixedRate and an additional per dispositive")
    public void commercialPlanClientWithoutDevices() {
        Plan comercialPlan = new CommercialPlan(100, 15);
        Client client = new Client("Juan", "av rivadavia 200", "11231241", comercialPlan);

        assertEquals(100, client.calculatePrice());

    }

    @Test
    @DisplayName("A client with a corporative plan with discount percentage, pays less than its base rate")
    public void corporativePlanClient() {
        Plan corporativePlan = new CorporativePlan(170, 15);
        Client client = new Client("Juan", "av rivadavia 200", "11231241", corporativePlan);

        assertEquals(144.5, client.calculatePrice());

    }
}