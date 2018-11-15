package com.domain;

/**
 * An {@link Aggregate} is a cluster of associated objects that we treat as a unit for the purpose of data changes.
 *
 * Each {@link Aggregate} has a root and a boundary. The boundary defines what is inside the {@link Aggregate}.
 *
 * The root is a single, specific **Entity** contained in the {@link Aggregate}.
 *
 * The root is the only member of the {@link Aggregate} that outside objects are allowed to hold references to,
 * although objects within the boundary may hold references to each other.
 *
 * @author Thomas Plumpton
 * @param <T> Value (Generic Type)
 * @see Entity
 */
public interface Aggregate<T> extends Entity<T> {
}
