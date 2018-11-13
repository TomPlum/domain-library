package com.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * A ValueObject that has a single value, of a specified generic data type.
 * @param <V> Value Data Type
 * @see ValueObject
 */
public abstract class SingleValueObject<V> implements ValueObject {
    private final V value;

    public SingleValueObject(V value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        SingleValueObject<?> that = (SingleValueObject<?>) o;

        return new EqualsBuilder().append(value, that.value).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(value).toHashCode();
    }

    public V getValue() {
        return value;
    }
}
