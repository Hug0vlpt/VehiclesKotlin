package classesV.electricV

import enums.Noise

class ElecMotoC: ElectricVehicle() {
    override val name = "electric motorcycle"
    override val nbWheels = 2
    override val noisePoll = Noise.QUIET
    fun rearsUp() {
        println("The $name rears up!")
    }
}

