package creational.abstractfactory;

/**
 * Abstract Factory class will produce Course objects by implementing in every Course class
 *
 * @author VIVEK KUMAR SINGH
 * @since (2018-04-25 16:14:17)
 */
public interface AbstractCourseFactory {
  Course getCourse();
}
