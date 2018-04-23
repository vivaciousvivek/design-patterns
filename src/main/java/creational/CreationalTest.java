package creational;

import creational.builder.NutritionFacts;
import creational.singleton.Singleton;

/**
 * @author VIVEK KUMAR SINGH
 * @since (2018-04-23 12:33:48)
 */
public class CreationalTest {
  public static void main(String[] args) {

    StringBuilder sb = new StringBuilder("*******Creational Design Patterns********\n");

    sb.append("\n ******(Singleton)*****");
    Singleton singleton = Singleton.getInstance();

    Singleton singleton1 = Singleton.getInstance();

    sb.append("\n ")
        .append(singleton.equals(singleton1))
        .append("\n")
        .append(" Object1: ")
        .append(singleton.hashCode())
        .append("\n Object2: ")
        .append(singleton1.hashCode());

    sb.append("\n\n ******(Builder)*****");

    /**
     * The builder’s setter methods return the builder itself so that invocations can be chained.
     *
     * <p>Builders are especially useful for constructing immutable objects because, for such
     * objects, all the data must be supplied at build time.
     */
    NutritionFacts nutritionFacts =
        new NutritionFacts.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();

    NutritionFacts nutritionFacts1 =
        new NutritionFacts.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();

    sb.append("\n ")
        .append(nutritionFacts.equals(nutritionFacts1))
        .append("\n")
        .append(" Object1: ")
        .append(nutritionFacts.hashCode())
        .append("\n Object2: ")
        .append(nutritionFacts1.hashCode());

    System.out.println(sb);
  }
}
