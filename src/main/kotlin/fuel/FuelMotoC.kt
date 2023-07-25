package fuel

import Noise

class FuelMotoC: FuelVehicle() {
    override val name = "fuel motorcycle"
    override val nbWheels = 2
    override val noisePoll = Noise.LOUD
    fun rearsUp() {
        println("The $name rears up!")
    }
}
