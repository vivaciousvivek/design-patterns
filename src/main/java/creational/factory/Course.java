package creational.factory;

import util.constant.Field;
import util.constant.Qualification;

/**
 * Common interface for all Courses
 *
 * @author VIVEK KUMAR SINGH
 * @since (2018-04-25 13:00:10)
 */
public interface Course {
  Qualification getQualification();

  Field getField();
}
