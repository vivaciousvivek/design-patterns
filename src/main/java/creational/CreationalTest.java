package creational;

import creational.abstractfactory.BaFactory;
import creational.abstractfactory.BtechFactory;
import creational.abstractfactory.MbbsFactory;
import creational.builder.NutritionFacts;
import creational.factory.Course;
import creational.factory.CourseFactory;
import util.constant.Field;
import util.constant.Qualification;
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

    /** Factory Pattern to create different objects of Course */
    sb.append("\n\n ******(Factory)*****");

    Course btech = CourseFactory.getCourse(Qualification.INTERMEDIATE, Field.ENGINEERING);
    Course mbbs = CourseFactory.getCourse(Qualification.INTERMEDIATE, Field.MEDICAL);
    Course ba = CourseFactory.getCourse(Qualification.INTERMEDIATE, Field.ARTS);

    sb.append("\n ")
        .append("B.Tech: ")
        .append(btech)
        .append("MBBS : ")
        .append(mbbs)
        .append("BA : ")
        .append(ba)
        .append("\n ")
        .append(btech.equals(mbbs))
        .append("\n")
        .append(" Object1: ")
        .append(btech.hashCode())
        .append("\n Object2: ")
        .append(mbbs.hashCode());

    /** Factory Pattern to create different objects of Course */
    sb.append("\n\n ******(Abstract Factory)*****");

    creational.abstractfactory.Course btech1 = creational.abstractfactory.CourseFactory.getCourse(new BtechFactory(Qualification.INTERMEDIATE, Field.ENGINEERING));
    creational.abstractfactory.Course mbbs1 = creational.abstractfactory.CourseFactory.getCourse(new MbbsFactory(Qualification.INTERMEDIATE, Field.MEDICAL));
    creational.abstractfactory.Course ba1 = creational.abstractfactory.CourseFactory.getCourse(new BaFactory(Qualification.INTERMEDIATE, Field.ARTS));

    sb.append("\n ")
            .append("B.Tech: ")
            .append(btech1)
            .append("MBBS : ")
            .append(mbbs1)
            .append("BA : ")
            .append(ba1)
            .append("\n ")
            .append(btech1.equals(mbbs1))
            .append("\n")
            .append(" Object1: ")
            .append(btech1.hashCode())
            .append("\n Object2: ")
            .append(mbbs1.hashCode());


    /**
     * The builder’s setter methods return the builder itself so that invocations can be chained.
     *
     * <p>Builders are especially useful for constructing immutable objects because, for such
     * objects, all the data must be supplied at build time.
     */
    sb.append("\n\n ******(Builder)*****");
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
