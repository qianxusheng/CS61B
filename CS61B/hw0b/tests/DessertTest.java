import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static com.google.common.truth.Truth.assertWithMessage;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DessertTest {
    @Test
    @Order(0)
    @DisplayName("Test Dessert class")
    public void testDessert() {
        // TODO: Uncomment this test when you've created and completed Dessert.java!
        // TODO: Delete lines 24 and 60 of this file to uncomment.
    }
}
