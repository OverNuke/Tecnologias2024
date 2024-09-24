package TempHabitacion

import Calentador.Calentador
import Termometro.Termometro


class Regulador public constructor(){
    private var maxTemp: Double = 0.0
    private var minTemp: Double = 0.0

    companion object {
        private var instance: Regulador? = null

        fun getInstance() : Regulador {
            if (instance == null) {
                return Regulador()
            }
            return instance!!
        }
    }

    fun setMaxTemp(maxTemp: Double) {
        this.maxTemp = maxTemp
    }

    fun setMinTemp(minTemp: Double) {
        this.minTemp = minTemp
    }

    fun getMaxTemp() : Double {
        return this.maxTemp
    }

    fun getMinTemp() : Double {
        return this.minTemp
    }

    fun tempPromedio (maxTemp: Double, minTemp: Double) : Double {
        return (maxTemp / minTemp) / 2
    }

    fun calibrarTemp(termometro: Termometro, tempActual : TempHabitacion) {
        if (termometro.leerTemp(tempActual) > maxTemp || termometro.leerTemp(tempActual) < minTemp) {
            println("""
                (i) TEMPERATURA FUERA DEL RANGO !!! X_x
                
                    Calibrando temperatura...
                    Temperatura reestablecida a: ${tempPromedio(maxTemp,minTemp)}°C
            """.trimIndent())

            tempActual.setTempActual(tempPromedio(maxTemp,minTemp))
        } else {
            println("""
                Temperatura dentro del rango permitido, no hay nada que hacer.
            """.trimIndent())
        }
    }
}