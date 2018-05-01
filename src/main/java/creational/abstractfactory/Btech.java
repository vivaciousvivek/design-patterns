package creational.abstractfactory;

import util.constant.Field;
import util.constant.Qualification;

/**
 * @author VIVEK KUMAR SINGH
 * @since (2018-04-25 13:13:08)
 */
public class Btech implements Course {
  Qualification qualification;
  Field field;

  public Btech(Qualification qualification, Field field) {
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
