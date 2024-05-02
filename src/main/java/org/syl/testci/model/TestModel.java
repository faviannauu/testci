package org.syl.testci.model;

import jakarta.persistence.*;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tests")
public class TestModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name="test_name", updatable = false, nullable = false)
    private String name;

    @Column(name="test_description", nullable = false)
    private String description;

    @Column(name="test_image_url", nullable = false)
    private String imageUrl;

    public TestModel() { }

    public TestModel(UUID itemId, String itemName, String itemDescription, String itemImageUrl) {
        this.id = itemId;
        this.name = itemName;
        this.description = itemDescription;
        this.imageUrl = itemImageUrl;
    }
}