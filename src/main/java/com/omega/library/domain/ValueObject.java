package com.omega.library.domain;

/**
 * Many objects have no conceptual identity. These objects describe some characteristic of a thing.
 *
 * When you care only about the attributes of an element of the model, classify it as a {@link ValueObject}.
 * Make it express the meaning of the attributes it conveys and give it related functionality.
 * Treat the {@link ValueObject} as immutable. Don't give it any identity and avoid the design complexities necessary
 * to maintain {@link Entity}.
 *
 * @author Thomas Plumpton
 * @see Entity
 */
public interface ValueObject {
}
