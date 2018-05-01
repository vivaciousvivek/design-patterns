package creational.abstractfactory;

import util.constant.Field;
import util.constant.Qualification;

/**
 * @author VIVEK KUMAR SINGH
 * @since (2018-04-25 13:11:49)
 */
public class Mbbs implements Course {
  private Qualification qualification;
  private Field field;

  public Mbbs(Qualification qualification, Field field) {
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
