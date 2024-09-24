import Calentador.*
import Termometro.*
import TempHabitacion.*
import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    var tempActual: TempHabitacion = TempHabitacion.getInstance()
    var calentador: CalentadorGas()
    var termometro: TermometroDigital()
    val regulador: Regulador = Regulador()

    regulador.setMaxTemp(30.0)
    regulador.setMinTemp(15.0)
    tempActual.setTempActual(25.0)
}
