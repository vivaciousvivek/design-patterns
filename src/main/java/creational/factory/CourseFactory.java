package creational.factory;

import util.constant.Field;
import util.constant.Qualification;

/**
 * Factory class to produce Course objects
 *
 * @author VIVEK KUMAR SINGH
 * @since (2018-04-23 17:47:07)
 */
public class CourseFactory {
  private CourseFactory() {}

  /**
   * This Factory pattern makes this class tightly coupled with Concrete classes of Courses, Using
   * Abstract Factory Pattern we can resolve this problem.
   *
   * @param qualification
   * @param field
   * @return Course and its subclass object
   */
  public static Course getCourse(Qualification qualification, Field field) {
    if (qualification == Qualification.INTERMEDIATE) {
      if (field == Field.ENGINEERING) return new Btech();
      else if (field == Field.MEDICAL) return new Mbbs();
      else if (field == Field.ARTS) return new Ba();
    } else if (qualification == Qualification.GRADUATION) {
      // logic here to produce courses for Graduation qualification
    }
    throw new IllegalArgumentException("No course available for this qualification and field");
  }
}
