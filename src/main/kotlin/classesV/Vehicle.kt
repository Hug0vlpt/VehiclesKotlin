package classesV

import interfacesV.IVehicle
import enums.Noise

abstract class Vehicle : IVehicle {
    abstract val name: String
    abstract val nbWheels: Int
    abstract val noisePoll: Noise
    override fun start() {
        println("The $name starts.")
    }

    override fun stop() {
        println("The $name stops.")
    }

    override fun speedUp() {
        println("The $name speeds up!")
    }

    override fun slowDown() {
        println("The $name slows down.")
    }

    override fun getNbW(): Int {
        return nbWheels
    }

    override fun getNP(): Noise {
        return noisePoll
    }
}
