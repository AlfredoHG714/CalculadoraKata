import org.scalatest.funsuite.AnyFunSuite

class CalculadoraKataPruebas extends AnyFunSuite {

  test("Validar cadena vacía") {
    val resultado = CalculadoraKata.Add("")
    assert(resultado == 0)
  }

  test("Validar valor de 1") {
    val resultado = CalculadoraKata.Add("1")
    assert(resultado == 1)
  }

  test("Validar valor de 1, 2") {
    val resultado = CalculadoraKata.Add("1,2")
    assert(resultado == 3)
  }

  test("Validar 4 elementos") {
    val resultado = CalculadoraKata.Add("7,1,4,2")
    assert(resultado == 14)
  }

  test("Validar 5 elementos") {
    val resultado = CalculadoraKata.Add("7,1,4,2,3")
    assert(resultado == 17)
  }

  test("Validar 7 elementos") {
    val resultado = CalculadoraKata.Add("7,1,4,2,3,1,4")
    assert(resultado == 21)
  }

  test("Validar comas  y saltos de línea") {
    val resultado = CalculadoraKata.Add("7" + "," + "1" + "," + "4" + "\n" +
      "2" + "\n" +
      "3")
    assert(resultado == 17)
  }

  test("Validar final de cadena con comas") {
    val resultado = CalculadoraKata.Add("7" + "," + "1" + "," + "4" + "\n" +
      "2" + ",")
    assert(resultado == 14)
  }
}
