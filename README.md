# spring-inheritance-strategies

A demonstration and notes for each of the Hibernate inheritance mapping strategies based on this article: https://www.baeldung.com/hibernate-inheritance

Key for class names:
* MS - MappedSuperClass
* ST - Single Table
* JT - Joined Table
* TPC - Table Per Class

Info on classes:
* Each parent class has an @Id annotated Long id. The child classes inherit this in each case.
* The parent classes have a String field called superField. The child classes have a String field called childField.

# Notes
## MappedSuperClass
* The super class is not annotated with @Entity so there is no table for it.
* The tables for the child classes contain the inherited fields as well as the child fields.
* Super class cannot be associated with other entities.
* Probably ideal if you want to have shared class properties without there being a shared table.
<img width="204" alt="image" src="https://github.com/dmackay39/spring-inheritance-strategies/assets/84335791/494a7465-0deb-476d-b33d-d67a43ad3e66">

## Single Table
* The child classes don't have tables.
* All information contained in one table with all fields of both classes. This means you can't require any fields on child classes to be non-null.
* Distinguish between child classes with another column in the table: here listed as child_type.
* This has best performance for polymorphic queries as everything is in one table and you don't need to do any joins.
<img width="346" alt="image" src="https://github.com/dmackay39/spring-inheritance-strategies/assets/84335791/28a7f755-31df-44b5-9ec3-b7751150cd6a">

## Joined Table
* Super and child classes have tables but each with separate information. Child tables only have child fields etc.
* Key of the child table is required to be a foreign key to the super table. So child tables may have strange looking sequences of ids, eg "2,3,6" rather than "1,2,3".
<img width="172" alt="image" src="https://github.com/dmackay39/spring-inheritance-strategies/assets/84335791/55727e34-be06-472b-a977-a3906832ae2a">

## Table Per Class
* Both the super and child classes have tables.
* The child tables contain inherited fields.
* May be good if you want to have an association with the super class and child class. And if you want to be able to get all the child class information without querying the super table.
<img width="206" alt="image" src="https://github.com/dmackay39/spring-inheritance-strategies/assets/84335791/b8cd300f-8aff-4422-9117-141157274cff">

