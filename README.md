# Domain Library

[![](https://jitpack.io/v/TomPlum/domain-library.svg)](https://jitpack.io/#TomPlum/domain-library)
[![GitHub Issues](https://img.shields.io/github/issues/TomPlum/domain-library.svg)](https://github.com/TomPlum/domain-library/issues)
[![GitHub license](https://img.shields.io/github/license/TomPlum/domain-library.svg)](https://github.com/TomPlum/domain-library/blob/master/LICENSE)

A library containing marker interfaces for Domain-Driven Design elements.

See [Domain-Driven Design Template](https://github.com/TomPlum/domain-driven-design-template) for an IntelliJ IDEA template project with a layered-architecture structure using Gradle modules.

The library currently contains the following Domain-Driven Design marker interfaces;

## [Aggregate](https://github.com/TomPlum/domain-library/blob/26e2faf3ea0dd842d7c365959374801dd4defe73/src/main/java/com/domain/Aggregate.java#L3-L9)
> An **Aggregate** is a cluster of associated objects that we treat as a unit for the purpose of data changes. Each **Aggregate** has a root and a boundary. The boundary defines what is inside the **Aggregate**. The root is a single, specific **Entity** contained in the **Aggregate**. The root is the only member of the **Aggregate** that outside objects are allowed to hold references to, although objects within the boundary may hold references to each other.

## [Entity](https://github.com/TomPlum/domain-library/blob/165b5b7a1f31e458d18fea9dc5e6633a3ad1f5b0/src/main/java/com/domain/Entity.java#L3-L9) (A.K.A Reference Objects)
> Many objects are not fundamentally defined by their attributes, but rather by a thread of continuity and identity.

> Some objects are not defined primarily by their attributes. They represent a thread of identity that runs through time and often across distinct representations. Sometimes such an object must be matched with another object even though attributes differ. An object must be distinguished from other objects even though they might have the same attributes. Mistaken identity can lead to data corruption.

## [Factory](https://github.com/TomPlum/domain-library/blob/3e56749dcb6f95c0bc21a1ab5eb5a12fbd274ba4/src/main/java/com/domain/Factory.java#L3-L7)
> When the creation of an object, or an entire **Aggregate**, becomes complicated or reveals too much of the internal structure, **Factories** provide encapsulation.

> Creation of an object can be a major operation in itself, but complex assembly operations do not fit the responsibility of the created objects. Combining such responsibilities can produce ungainly designs that are hard to understand. Making the client direct construction muddies the design of the client, breaches encapsulation of the assembled object or **Aggregate**, and overly couples the client to the implementation of the created object.

## [Repository](https://github.com/TomPlum/domain-library/blob/3bd71f78b0da7dfbd5cef07ac952263daeab106f/src/main/java/com/domain/Repository.java#L3-L15)
> Associations allow us to find an object based on its relationship to another. But we must have a starting point for a traversal of an **Entity** or **Value** in the middle of its life-cycle.

> For each type of object that needs global access, create an object that can provide the illusion of an in-memory collection of all objects of that type. Set up access through a well-known global interface. Provide methods to add and remove objects, which will encapsulate the actual insertion or removal of data in the data store. Provide methods that select objects based on some criteria and return fully instantiated objects or collections of objects whose attribute values meet the criteria, thereby encapsulating the actual storage and query technology. Provide **Repositories** only for **Aggregate** roots that actually need direct access. Keep the client focused on the model, delegating all object storage and access to the **Repositories**.

## [Service](https://github.com/TomPlum/domain-library/blob/ddd6f37852c1f799a8b284df9b84c36c9ba54e01/src/main/java/com/domain/Service.java#L3-L4)
> Sometimes, it just isn't a thing. In some cases, the clearest and most pragmatic design includes operations that do not conceptually belong to any object. Rather than force the issues, we can follow the natural contours of the problem space and include **Services** explicitly in the model.

> A good **Service** has three characteristics;
> 1. The operation relates to a domain concept that is not a natural part of an **Entity** or **Value Object**.
> 2. The interface is defined in terms of other elements of the domain model.
> 3. The operation is stateless.

## [ValueObject](https://github.com/TomPlum/domain-library/blob/bb60f59e0bf56a0955d4f28679767ad30873468e/src/main/java/com/domain/ValueObject.java#L3-L4)
> Many objects have no conceptual identity. These objects describe some characteristic of a thing.
> When you care only about the attributes of an element of the model, classify it as a **Value Object**. Make it express the meaning of the attributes it conveys and give it related functionality. Treat the **Value Object** as immutable. Don't give it any identity and avoid the design complexities necessary to maintain **Entities**.

*All definitions are quoted from 'Domain-Driven Design: Tackling Complexity in the Heart of Software', by Eric J. Evans.*
