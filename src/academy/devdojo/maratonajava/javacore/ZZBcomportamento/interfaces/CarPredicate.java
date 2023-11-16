package academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

@FunctionalInterface
public interface CarPredicate {
    // anônimas, funções, conciso
    boolean test(Car car);
    //(parametro) -> <expressão>
    //(Car car) -> car.getColor().equals.("green"); >> vai retornar boolean: true or false <<
}

// Para utilizar lambdas é preciso uma interface funcional = apenas um metodo abstrato
// O proprio metodo da interface diz como a lambda vai se comportar(contrato)
  // ex -> boolean test(Car car) = deve retornar um boolean e recebe um parametro que e o carro
