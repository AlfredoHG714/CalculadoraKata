object CalculadoraKata {

  def Add(valor: String): Int = {
    if (valor.isEmpty) 0
    else {
      if (valor.endsWith(",")) {
        throw new IllegalArgumentException("Error: La cadena no puede terminar con una coma")
      }
      else {
        val Separador = valor.split("[,\n]").map(a => a.toInt)
        Separador.sum
      }
    }
  }

}
