package creational.abstractfactory;

import util.constant.Field;
import util.constant.Qualification;

/**
 * Factory class to produce MBBS Course object
 *
 * @author VIVEK KUMAR SINGH
 * @since (2018-04-25 17:25:31)
 */
public class MbbsFactory implements AbstractCourseFactory {

  private Qualification qualification;
  private Field field;

  public MbbsFactory(Qualification qualification, Field field) {
    this.qualification = qualification;
    this.field = field;
  }

  @Override
  public Course getCourse() {
    return new Mbbs(qualification, field);
  }
}
