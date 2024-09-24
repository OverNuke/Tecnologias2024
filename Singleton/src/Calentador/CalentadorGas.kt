package Calentador;
import TempHabitacion.TempHabitacion;
import java.util.Scanner;

class CalentadorGas : Calentador {


    companion object {
        private var instance : CalentadorGas? = null
        fun getInstance() : CalentadorGas {
            if (instance == null) {
                return CalentadorGas()
            }
            return instance!!
        }
    }

    override fun ajustarTemp(tempActual : TempHabitacion) {
        var input = Scanner(System.`in`)
        var continuar = true

        while(continuar) {

            println("""
                    (i) Selecciona una opción:
                    
                    1. Aumentar la temperatura (+2'C)
                    2.- Atrás
                    """.trimIndent());

            var opcion : Int = input.nextInt()

            when(opcion) {
                1 -> {
                    tempActual.setTempActual(tempActual.getTempActual() + 2)
                    println("""
                        .::Temperatura aumentada: + 2°C
                        -------------------------------
                        Temp. Actual ${tempActual.getTempActual()}°C
                    """.trimIndent())
                }
                2 -> {
                    println("""
                        Regresando al menú principal...
                    """.trimIndent())
                    continuar = false
                }
                else -> {
                    println("""
                        Opción no válida
                    """.trimIndent())
                }
            }
        }
    }

}
