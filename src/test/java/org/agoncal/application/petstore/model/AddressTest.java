package org.agoncal.application.petstore.model;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Test;

/**
 * @author Antonio Goncalves
 */
public class AddressTest {

    // ======================================
    // =              Methods               =
    // ======================================

    @Test
    public void shouldCheckEqualsAndHashCode() {

        // Checks equals and hashCode is valid
        EqualsVerifier.forClass(Address.class).suppress(Warning.NONFINAL_FIELDS).withIgnoredFields("street2","state","country").usingGetClass().verify();
    }
}