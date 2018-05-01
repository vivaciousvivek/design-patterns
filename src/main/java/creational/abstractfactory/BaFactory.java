package creational.abstractfactory;

import util.constant.Field;
import util.constant.Qualification;

/**
 * Factory class to produce BA Course object
 *
 * @author VIVEK KUMAR SINGH
 * @since (2018-04-25 17:20:47)
 */
public class BaFactory implements AbstractCourseFactory {
  private Qualification qualification;
  private Field field;

  public BaFactory(Qualification qualification, Field field) {
    this.qualification = qualification;
    this.field = field;
  }

  @Override
  public Course getCourse() {
    return new Ba(qualification, field);
  }
}
