package creational.factory;

import util.constant.Field;
import util.constant.Qualification;

/**
 * @author VIVEK KUMAR SINGH
 * @since (2018-04-25 13:13:08)
 */
public class Btech implements Course {

  public Qualification getQualification() {
    return Qualification.INTERMEDIATE;
  }

  public Field getField() {
    return Field.ENGINEERING;
  }
}
