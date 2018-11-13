package com.domain;

/**
 * A Domain-Driven Design Entity
 * @param <T> ID Data Type
 */
public interface Entity<T> {
    T getId();
}
