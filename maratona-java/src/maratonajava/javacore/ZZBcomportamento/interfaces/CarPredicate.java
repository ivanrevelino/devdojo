package maratonajava.javacore.ZZBcomportamento.interfaces;

import maratonajava.javacore.ZZBcomportamento.dominio.Car;

@FunctionalInterface
public interface CarPredicate {
    boolean test(Car car); //Contrato da minha lambda diz que temos que (retornar um boolean)
    // (parametro) -> <expressao>
    // (Car car) -> car.getColor().equals("green")
}

// Para utilizarmos lambdas precisamos ter uma inteface funcional
// Interface funcional e uma interface que tem apenas um metodo abstrato
// O propio metodo diz como a lambda vai funcionar