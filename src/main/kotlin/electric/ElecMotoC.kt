package electric

import Noise
import electric.ElectricVehicle

class ElecMotoC: ElectricVehicle() {
    override val name = "electric motorcycle"
    override val nbWheels = 2
    override val noisePoll = Noise.QUIET
    fun rearsUp() {
        println("The $name rears up!")
    }
}

