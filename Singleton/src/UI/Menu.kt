package UI
import Calentador.*
import Termometro.*
import TempHabitacion.*
import java.util.Scanner

class Menu {
    val input = Scanner(System.`in`)
    var tempActual: TempHabitacion = TempHabitacion.getInstance()
    var calentador: CalentadorGas()
    var termometro: TermometroDigital()
    private val regulador: Regulador = Regulador()

    fun mostrarMenu() {
        println("""
            .::Sistema de calefacción::.
            
            Seleccione una opción:
            
            1. Encender calefacción
            2. Revisar temometro
            3. Calibrar temperatura
            0. Salir
        """.trimIndent())

        var opcion: Int = input.nextInt()

        when (opcion) {
            1 -> {
            calentador.ajustarTemp(tempActual)
            }

            2 -> {
            termometro.mostrarTemp(tempActual)
            }
            3 -> {
            regulador.calibrarTemp(termometro, tempActual)
            }
            0 -> {
            println("""
                SALIENDO.... 
            """.trimIndent())
            }
            else -> {
            println("""
                Opción no válida
            """.trimIndent())
            }
        }
    }

}