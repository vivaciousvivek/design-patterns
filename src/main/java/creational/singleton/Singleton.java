package creational.singleton;
/**
 * The singleton design pattern restricts the instantiation of a class to one object or produce only
 * one object.
 *
 * <p>Responsibilities of singleton class:
 *
 * <p>i) Static in Nature
 *
 * <p>ii) Thread Safe
 *
 * <p>iii) Private Constructor
 *
 * <p>iv) Private Instance of the Class
 *
 * <p>v) No parameters to the Constructor
 *
 * @author VIVEK KUMAR SINGH
 * @since (2018-04-20 18:55:05)
 */
public class Singleton {
  /**
   * Below code is for Eager Loading(Create object of the class when the JVM loads the class), this
   * technique is not effective, we should create an object when we need actually.
   *
   * <p>private Singleton instance = new Singleton();
   *
   * <p>Below code is a good way to hold Singleton object by making it static in nature private
   * static Singleton instance = null;
   */
  private static volatile Singleton instance = null;

  /** Private Constructor so that no one can instantiate this class from outside */
  private Singleton() {}

  /**
   * (Lazy Loading, i.e whenever we need the object then only we produce the object)
   *
   * <p>Below code will create the singleton object but it has one problem in that, it is not thread
   * safe.
   *
   * <p>return instance; }
   *
   * @return singleton object every time(create if it is null otherwise reuse the same object every
   *     time)
   */
  /*public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }

    return instance;
  }*/

  /**
   * (By making it thread safe we have to make this synchronized.
   *
   * <p>To make it synchronized we have multiple approaches)
   */

  /**
   * below approach will make whole method to synchronized, that is not good to make whole method to
   * synchronized
   *
   * <p>But synchronized performance has been improved in newer JVMs.
   */
  /*public static synchronized Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }

    return instance;
  }*/

  /** below approach will make only the code we need to synchronized synchronized */
  /*public static Singleton getInstance() {
    if (instance == null) {
      synchronized (Singleton.class) {
        instance = new Singleton();
      }
    }

    return instance;
  }*/

  /**
   * In the below code snippet imagine that multiple threads comes concurrently and tries to create
   * the new instance. In such situation the may be three or more threads are waiting on the
   * synchronized block to get access.
   *
   * <p>Since we have used synchronized only one thread will be given access. All the remaining
   * threads which were waiting on the synchronized block will be given access when first thread
   * exits this block.
   *
   * <p>However when the remaining concurrent thread enters the synchronized block they are
   * prevented to enter further due to the double check : null check.
   *
   * <p>Since the first thread has already created an instance no other thread after that will enter
   * this block.
   *
   * <p>All the remaining threads that were not lucky to enter the synchronized block along with the
   * first thread will be blocked at the first null check.
   *
   * <p>This mechanism is called double checked locking and it provides significant performance
   * benefit and also it is cost effective solution.
   *
   * <p>Note:
   *
   * <p>Unfortunately, that code just does not work in the presence of either optimizing compilers
   * or shared memory multiprocessors.
   *
   * <p>Prior to Java 5, java memory model had a lot of issues and above approaches used to fail in
   * certain scenarios where too many threads try to get the instance of the Singleton class
   * simultaneously. So Bill Pugh came up with a different approach to create the Singleton class
   * using a inner static helper class.
   *
   * @return
   */
  /*public static Singleton getInstance() {
    if (instance == null) {
      synchronized (Singleton.class) {
        if (instance == null) {
          instance = new Singleton();
        }
      }
    }

    return instance;
  }*/

  /**
   * JDK5 and later extends the semantics for volatile.
   *
   * <p>So, Using volatile is yet another way (like synchronized, atomic wrapper) of making class
   * thread safe.
   *
   * <p>Volatile variables have the visibility features of synchronized but not the atomicity
   * features. The values of volatile variable will never be cached and all writes and reads will be
   * done to and from the main memory.
   *
   * <p>We can make volatile variable operations atomic by manipulating it inside the synchronized
   * block.
   *
   * <p>private static volatile Singleton instance = null;
   *
   * @return
   */
  /*public static Singleton getInstance() {
    if (instance == null) {
      synchronized (Singleton.class) {
        if (instance == null) {
          instance = new Singleton();
        }
      }
    }

    return instance;
  }*/

  /**
   * But the best approach is using Bill Pugh Singleton Implementation(Singleton using inner static
   * helper class)
   */
  public static class SingletonHelper {
    private static final Singleton instance = new Singleton();
  }

  public static Singleton getInstance() {
    return SingletonHelper.instance;
  }
}
