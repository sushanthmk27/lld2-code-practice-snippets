package designpatterns.prototypeandregistry;

public interface Prototype<T> {             // Here we are using Generics since we dont know which class might implement the copy method
    T copy();                               // Generics is used to define the type of the method
}
