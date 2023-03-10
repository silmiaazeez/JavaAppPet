package org.agoncal.application.petstore.model;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Test;

/**
 * @author Antonio Goncalves
 */
public class PurchaseOrderTest {

    // ======================================
    // =              Methods               =
    // ======================================

    @Test
    public void shouldCheckEqualsAndHashCode() {

        // Checks equals and hashCode is valid
        EqualsVerifier.forClass(PurchaseOrder.class).suppress(Warning.NONFINAL_FIELDS).withIgnoredFields("version", "totalWithoutVat", "vatRate", "vat", 
            "totalWithVat", "discountRate", "discount", "total", "orderLines", "deliveryAddress", "creditCard").withNonnullFields("orderDate", "customer").usingGetClass().verify();
    }
}