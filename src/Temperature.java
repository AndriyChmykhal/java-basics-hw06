public class Temperature {

  /**
   * Converts temperature from Fahrenheit to Celsius degree.
   *
   * @param fahrenheit temperature degree in Fahrenheit
   * @return temperature degree in Celsius
   */
  public static double fahrenheitToCelsius(double fahrenheit) {
    double c = 5*(fahrenheit - 32)/9;
    return c;
  }

  /**
   * Converts temperature from Celsiusto Fahrenheit degree.
   *
   * @param celsius temperature degree in Celsius
   * @return temperature degree in Fahrenheit
   */
  public static double celsiusToFahrenheit(double celsius) {
    double f = (9*celsius + 160)/5;
    return f;
  }
}

/*F = (9*C + 160)/5

C = 5*(F - 32)/9*/