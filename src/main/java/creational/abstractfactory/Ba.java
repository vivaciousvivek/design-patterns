package creational.abstractfactory;

import util.constant.Field;
import util.constant.Qualification;

/**
 * @author VIVEK KUMAR SINGH
 * @since (2018-04-25 14:15:25)
 */
public class Ba implements Course {
  private Field field;
  private Qualification qualification;

  public Ba(Qualification qualification, Field field) {
    this.qualification = qualification;
    this.field = field;
  }

  public Qualification getQualification() {
    return qualification;
  }

  public Field getField() {
    return field;
  }
}
