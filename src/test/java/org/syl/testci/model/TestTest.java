package org.syl.testci.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class TestTest {
    private TestModel item;
    private final UUID itemId = UUID.randomUUID();
    private final String itemName = "SugarSnap Chocolate Bar";
    private final String itemDescription = "A sweet and delicious chocolate bar";
    private final String itemImageUrl = "/Chocolate.png";

    @BeforeEach
    public void setUp() {
        item = new TestModel(itemId, itemName, itemDescription, itemImageUrl);
    }

    @Test
    void testCreateTestModelSuccessful() {
        assertNotNull(item);
        assertNotNull(item.getId());
        assertNotNull(item.getName());
        assertNotNull(item.getDescription());
        assertNotNull(item.getImageUrl());
        assertEquals(itemId, item.getId());
        assertEquals(itemName, item.getName());
        assertEquals(itemDescription, item.getDescription());
        assertEquals(itemImageUrl, item.getImageUrl());
    }

    @Test
    void testSetTestModelId() {
        item.setId(UUID.randomUUID());
        assertNotNull(item);
        assertNotNull(item.getId());
        assertNotEquals(itemId, item.getId());
    }

    @Test
    void testSetTestModelName() {
        item.setName("Banana Blaster");
        assertNotNull(item);
        assertNotNull(item.getName());
        assertNotEquals(itemName, item.getName());
    }

    @Test
    void testSetTestModelDescription() {
        item.setDescription("Banana flavored ice cream");
        assertNotNull(item);
        assertNotNull(item.getDescription());
        assertNotEquals(itemDescription, item.getDescription());
    }

    @Test
    void testSetTestModelImageUrl() {
        item.setImageUrl("/banana-blaster.png");
        assertNotNull(item);
        assertNotNull(item.getImageUrl());
        assertNotEquals(itemImageUrl, item.getImageUrl());
    }
}