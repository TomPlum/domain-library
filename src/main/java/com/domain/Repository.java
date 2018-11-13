package com.domain;

/**
 * A Domain Driven Design Repository. Responsible for CRUD (Create, Read, Update Delete)
 * operations of Aggregates that have uniquely identifying key values.
 * @param <K> Key
 * @param <A> Aggregate
 * @see Aggregate
 */
public interface Repository<K, A extends Aggregate<?>> {
    A create(A aggregate);
    A read(K key);
    void update(A aggregate);
    void delete (K key);
}
