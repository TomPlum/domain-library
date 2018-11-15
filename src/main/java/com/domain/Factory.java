package com.domain;

/**
 * When the creation of an object, or an entire {@link Aggregate}, becomes complicated or reveals too much of the internal
 * structure, Factories provide encapsulation.
 *
 * Creation of an object can be a major operation in itself, but complex assembly operations do not fit the
 * responsibility of the created objects. Combining such responsibilities can produce ungainly designs that are hard
 * to understand. Making the client direct construction muddies the design of the client, breaches encapsulation of
 * the assembled object or {@link Aggregate}, and overly couples the client to the implementation of the created object.
 *
 * @author Thomas Plumpton
 */
public interface Factory {
}
