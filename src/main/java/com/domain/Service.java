package com.domain;

/**
 * Sometimes, it just isn't a thing. In some cases, the clearest and most pragmatic design includes operations that do
 * not conceptually belong to any object. Rather than force the issues, we can follow the natural contours of the
 * problem space and include **Services** explicitly in the model.
 *
 * A good **Service** has three characteristics;
 * 1. The operation relates to a domain concept that is not a natural part of an **Entity** or **Value Object**.
 * 2. The interface is defined in terms of other elements of the domain model.
 * 3. The operation is stateless.
 *
 * @author Thomas Plumpton
 * @see Entity
 * @see ValueObject
 */
public interface Service {
}
