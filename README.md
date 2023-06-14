# Design Pattern
    - Design patternare the well proved solution of commonly occurring problems in software design.
    - Design pattern represents an idea.

#   Categorization of Design Pattern
#       Creational Design Pattern (Ensures how object is being created)
            Factory Pattern
            Builder Pattern
            Singleton Pattern
            etc…
#       Structural Design Patter (Ensures Structures of the code)
            Proxy Pattern
            Adaptor Patter
            etc… 
#       Behavioral Design Patter (Ensures Object interactions)
            Observer Patter
            State Pattern
            Iterator Pattern
            etc…

#       Singleton Design Pattern
        When there is a need that for a particular class the object needs to be created only once and then if called by any client then the only object is to be shared that is restrict the client to create an object of that class by calling the constructor. To do this -
        The constructor of the class have to be private.
        The class must have a static field of own type
        There is one static method to get the object instance.

