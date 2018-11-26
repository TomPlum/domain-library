package com.omega.library.domain;

/**
 * Responsible for CRUD (Create, Read, Update Delete) operations of Aggregates that have uniquely identifying key values.
 *
 * Associations allow us to find an object based on its relationship to another. But we must have a starting point for
 * a traversal of an {@link Entity} or {@link ValueObject} in the middle of its life-cycle.
 *
 * For each type of object that needs global access, create an object that can provide the illusion of an in-memory
 * collection of all objects of that type. Set up access through a well-known global interface. Provide methods to add
 * and remove objects, which will encapsulate the actual insertion or removal of data in the data store.
 *
 * Provide methods that select objects based on some criteria and return fully instantiated objects or collections of
 * objects whose attribute values meet the criteria, thereby encapsulating the actual storage and query technology.
 *
 * Provide **Repositories** only for {@link Aggregate} roots that actually need direct access. Keep the client focused on
 * the model, delegating all object storage and access to the **Repositories**.
 *
 * @author Thomas Plumpton
 * @param <K> Key
 * @param <A> Value (Aggregate)
 * @see Aggregate
 * @see Entity
 * @see ValueObject
 */
public interface Repository<K, A extends Aggregate<?>> {
    /**
     * Insert an Aggregate object into some persistence store.
     * @param aggregate Aggregate Object To Persist
     * @return Unique Key of Inserted Object
     */
    K create(A aggregate);

    /**
     * Read an Aggregate object from the persistence store.
     * @param key Unique Key of Aggregate object to read.
     * @return Aggregate object
     */
    A read(K key);

    /**
     * Updates an Aggregate object already in the persistence store.
     * @param aggregate Aggregate object to update
     */
    void update(A aggregate);

    /**
     * Deletes an Aggregate object from the persistence store.
     * @param key Unique Key of Aggregate object to delete
     */
    void delete (K key);
}
