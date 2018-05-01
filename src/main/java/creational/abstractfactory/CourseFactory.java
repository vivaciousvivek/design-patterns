package creational.abstractfactory;

/**
 * Factory class to produce Course objects
 *
 * @author VIVEK KUMAR SINGH
 * @since (2018-04-25 16:51:41)
 */
public class CourseFactory {
  private CourseFactory() {}

  /**
   * By passing Abstract Factory we achieve loose coupling from concrete classes that we we facing
   * problem in factory pattern
   *
   * @param factory
   * @return Course and its subclass object
   */
  public static Course getCourse(AbstractCourseFactory factory) {
    return factory.getCourse();
  }
}
