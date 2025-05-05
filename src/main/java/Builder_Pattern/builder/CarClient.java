package Builder_Pattern.builder;

import Builder_Pattern.builder.Director.Director;
import Builder_Pattern.builder.concreteBuilder.ConcreteCarBuilder;

public class CarClient {
    public static void main(String[] args) {
        Director director = new Director();
        ConcreteCarBuilder concreteCarBuilder = new ConcreteCarBuilder();

        director.constructSportsCar(concreteCarBuilder);
        concreteCarBuilder.getCar();

        director.constructSUVsCar(concreteCarBuilder);
        concreteCarBuilder.getCar();

        director.constructCitysCar(concreteCarBuilder);
        concreteCarBuilder.getCar();
    }
}
