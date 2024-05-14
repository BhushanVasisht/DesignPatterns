# Abstract Factory

## Intent
Abstract Factory also known as Kit is a design pattern that provides a way 
to create families of factories without specifying their concrete classes. This 
allows for code that is independent of specific classes of objects, promoting 
flexibility and maintainability.

The abstract factory pattern provides a way to encapsulate a group of individual 
factories that have a common theme/connection/relation without specifying their concrete classes.

In other words, it is a factory of factories. A factory that groups the individual but related/dependent factories together without specifying their concrete classes.

## Explanation
### Real World Example
To create a kingdom, we need objects with a common theme. The kingdom needs a ruler, a palace, an army.
The elven kingdon has an elven king, an elvish castle and an elvish army.
The orcish kingdom has an orc king, an ocish castle, and orcish army.
The Dwarves have a dwarf king, a mountain dwelling, and dwarf army.

There is a dependency between the residents(objects) of the kingdom.

