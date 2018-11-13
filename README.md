# Domain Library
A library containing marker interfaces for Domain-Driven Design elements.


See [Domain-Driven Design Template](https://github.com/TomPlum/domain-driven-design-template) for an IntelliJ IDEA template project with a layered-arcitechture structure using Gradle modules.

Currently contains the following;

## [Aggregate](https://github.com/TomPlum/domain-library/blob/26e2faf3ea0dd842d7c365959374801dd4defe73/src/main/java/com/domain/Aggregate.java#L3-L9)
> An **Aggregate** is a cluster of associated objects that we treat as a unit for the purpose of data changes. Each **Aggregate** 
> has a root and a boundary. The boundary defines what is inside the **Aggregate**. The root is a single, specific **Entity**
> contained in the **Aggregate**. The root is the only member of the **Aggregate** that outside objects are allowed to hold 
> references to, although objects within the boundary may hold references to each other. *-Eric J. Evans*.


* Entity
* Factory
* Repository
* Service
* ValueObject
* SingleValueObject
