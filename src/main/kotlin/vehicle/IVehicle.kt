package vehicle

import Noise

interface IVehicle {
    fun start()
    fun stop()
    fun speedUp()
    fun slowDown()
    fun getNbW(): Int
    fun getNP(): Noise
}
