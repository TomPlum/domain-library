package com.domain;

/**
 * Many objects have no conceptual identity. These objects describe some characteristic of a thing.
 *
 * When you care only about the attributes of an element of the model, classify it as a **Value Object**.
 * Make it express the meaning of the attributes it conveys and give it related functionality.
 * Treat the **Value Object** as immutable. Don't give it any identity and avoid the design complexities necessary
 * to maintain **Entities**.
 *
 * @author Thomas Plumpton
 * @see Entity
 */
public interface ValueObject {
}
