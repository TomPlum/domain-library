package com.domain;

/**
 *  Many objects are not fundamentally defined by their attributes, but rather by a thread of continuity and identity.
 *
 *  Some objects are not defined primarily by their attributes. They represent a thread of identity that runs through
 *  time and often across distinct representations. Sometimes such an object must be matched with another object even
 *  though attributes differ.
 *
 *  An object must be distinguished from other objects even though they might have the same attributes.
 *
 *  Mistaken identity can lead to data corruption.
 *
 * @author Thomas Plumpton
 * @param <T> ID Data Type
 */
public interface Entity<T> {
    /**
     * Uniquely identifies the Entity as multiple Entities may have identical attributes.
     * @return Unique ID
     */
    T getId();
}
