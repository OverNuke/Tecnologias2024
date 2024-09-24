package TempHabitacion

class TempHabitacion private constructor() {
    private var tempActual : Double = 0.0

    companion object {
        private var instance : TempHabitacion? = null
        fun getInstance() : TempHabitacion {
            if (instance == null) {
                return TempHabitacion()
            }
            return instance!!
        }
    }

    fun setTempActual(TempActual : Double) {
        this.tempActual = TempActual
    }
    fun getTempActual() : Double {
        return this.tempActual
    }


}