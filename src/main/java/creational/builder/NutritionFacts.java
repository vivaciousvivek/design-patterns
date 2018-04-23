package creational.builder;
/**
 * 1. First we need to create static builder class inside the class, that object we need.
 *
 * <p>2. Create private constructor, or mark it as final, so that no one can make its object
 * directly and no class can inherit this class.
 *
 * <p>3. Copy all the member variables in this static Builder class.
 *
 * <p>4. Builder class should have a public constructor with all the required attributes as
 * parameters.
 *
 * <p>5. Builder class should have methods to set the optional parameters and it should return the
 * same Builder object(so that invocations can be chained) after setting the optional attribute.
 *
 * <p>6. provide a build() method in the builder class that will return the Object needed by client
 * program. For this we need to have a private constructor in the Class with Builder class as
 * argument.
 *
 * <p>7. Class that build its object using builder pattern is immutable, because all parameter
 * default values are in a single location.
 *
 * @author VIVEK KUMAR SINGH
 * @since (2018-04-23 14:47:27)
 */
public class NutritionFacts {
  // Required parameters
  private final int servingSize;
  private final int servings;

  // Optional parameters
  private final int calories;
  private final int fat;
  private final int sodium;
  private final int carbohydrate;

  /**
   * This constructor will set the values to the member variable of this claas by using Builder
   * static class.
   *
   * <p>We can also use getters if we need to serialize this class through JSON or etc.
   *
   * @param builder
   */
  private NutritionFacts(Builder builder) {
    this.servingSize = builder.servingSize;
    this.servings = builder.servings;
    this.calories = builder.calories;
    this.fat = builder.fat;
    this.sodium = builder.sodium;
    this.carbohydrate = builder.carbohydrate;
  }

  public static class Builder {
    // Required parameters
    private final int servingSize;
    private final int servings;

    // Optional parameters
    private int calories;
    private int fat;
    private int sodium;
    private int carbohydrate;

    /**
     * Not compulsory to create parameterized constructor, it will only required when we have some
     * compulsory properties of object
     *
     * @param servingSize
     * @param servings
     */
    public Builder(int servingSize, int servings) {
      this.servingSize = servingSize;
      this.servings = servings;
    }

    public Builder calories(int calories) {
      this.calories = calories;
      return this;
    }

    public Builder fat(int fat) {
      this.fat = fat;
      return this;
    }

    public Builder sodium(int sodium) {
      this.sodium = sodium;
      return this;
    }

    public Builder carbohydrate(int carbohydrate) {
      this.carbohydrate = carbohydrate;
      return this;
    }

    /**
     * Always produce the object from this method
     *
     * @return
     */
    public NutritionFacts build() {
      return new NutritionFacts(this);
    }
  }
}
