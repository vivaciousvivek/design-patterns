package creational.abstractfactory;

import util.constant.Field;
import util.constant.Qualification;

/**
 * Factory class to produce B.Tech Course object
 *
 * @author VIVEK KUMAR SINGH
 * @since (2018-04-25 17:24:40)
 */
public class BtechFactory implements AbstractCourseFactory {
  private Qualification qualification;
  private Field field;

  public BtechFactory(Qualification qualification, Field field) {
    this.qualification = qualification;
    this.field = field;
  }

  @Override
  public Course getCourse() {
    return new Btech(qualification, field);
  }
}
