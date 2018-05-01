package creational.factory;

import util.constant.Field;
import util.constant.Qualification;

/**
 * @author VIVEK KUMAR SINGH
 * @since (2018-04-25 14:15:25)
 */
public class Ba implements Course {
  public Qualification getQualification() {
    return Qualification.INTERMEDIATE;
  }

  public Field getField() {
    return Field.ARTS;
  }
}
