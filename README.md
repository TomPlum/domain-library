# Domain Library
A library containing marker interfaces for Domain-Driven Design elements.


See [Domain-Driven Design Template](https://github.com/TomPlum/domain-driven-design-template) for an IntelliJ IDEA template project with a layered-arcitechture structure using Gradle modules.

Currently contains the following;

## [Aggregate](https://github.com/TomPlum/domain-library/blob/26e2faf3ea0dd842d7c365959374801dd4defe73/src/main/java/com/domain/Aggregate.java#L3-L9)
> An **Aggregate** is a cluster of associated objects that we treat as a unit for the purpose of data changes. Each **Aggregate** 
> has a root and a boundary. The boundary defines what is inside the **Aggregate**. The root is a single, specific **Entity**
> contained in the **Aggregate**. The root is the only member of the **Aggregate** that outside objects are allowed to hold 
> references to, although objects within the boundary may hold references to each other.


## [Entity](https://github.com/TomPlum/domain-library/blob/165b5b7a1f31e458d18fea9dc5e6633a3ad1f5b0/src/main/java/com/domain/Entity.java#L3-L9) (A.K.A Reference Objects)
> Many objects are not fundamentally defined by their attributes, but rather by a thread of continuity and identity.

> Some objects are not defined pimrarily by their attributes. They represent a thread of identity that runs through time and often > across distinct representations. Sometimes such an object must be matched with another object even though attributes differ. An 
> object must be distinguished from other objects even though they might have the same attributes. Mistaken identity can lead to
> data corruption.

## [Factory](https://github.com/TomPlum/domain-library/blob/3e56749dcb6f95c0bc21a1ab5eb5a12fbd274ba4/src/main/java/com/domain/Factory.java#L3-L7)
> When the creation of an object, or an entire **Aggregate**, becomes complicated or reveals too much of the internal structure, **Factories** provide encapsulation.

> Creation of an object can be a major operation in itself, but complex assembly operations do not fit the responsibility of the > created objects. Combining such responsiblities can produce ungainly designs that are hard to understand. Making the client 
> direct construction muddies the design of the client, breaches encapsulation of the assembled object or **Aggregate**, and 
> overly couples the client to the implementation of the created object.

* Repository
* Service
* ValueObject
* SingleValueObject
