
import org.scalatest.funsuite.AnyFunSuite

class Factorial_Testcase extends AnyFunSuite {

  test("Factorial_Day_2 of 0 is 1") {
    val number = new Factorial_Day_2()
    assert(number.factorial_recursion(0, 1) == 1)
  }

  test("Factorial_Day_2 of 1 is 1") {
    val number = new Factorial_Day_2()
    assert(number.factorial_recursion(1, 1) == 1)
  }

  test("Factorial_Day_2 of 2 is 2") {
    val number = new Factorial_Day_2()
    assert(number.factorial_recursion(2, 1) == 2)
  }

  test("Factorial_Day_2 of 3 is 6") {
    val number = new Factorial_Day_2()
    assert(number.factorial_recursion(3, 1) == 6)
  }

  test("Factorial_Day_2 of 4 is 24") {
    val number = new Factorial_Day_2()
    assert(number.factorial_recursion(4, 1) == 24)
  }

  test("Factorial_Day_2 of 5 is 120") {
    val number = new Factorial_Day_2()
    assert(number.factorial_recursion(5, 1) == 120)
  }

  test("Factorial_Day_2 of 6 is 720") {
    val number = new Factorial_Day_2()
    assert(number.factorial_recursion(6, 1) == 720)
  }

  test("Factorial_Day_2 of 10 is 3628800") {
    val number = new Factorial_Day_2()
    assert(number.factorial_recursion(10, 1) == BigInt("3628800"))
  }


  test("Factorial_Day_2 of a negative number should throw an IllegalArgumentException") {
    assertThrows[IllegalArgumentException] {
      val number = new Factorial_Day_2()
      number.factorial_recursion(-1, 1)
    }

  }
}

