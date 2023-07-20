interface Vehicle {
    val nameV: String
    val nbWheels : Int
    val noisePoll: String

    fun start(nameV: String) {
        println("The $nameV starts.")
    }

    fun stop(nameV: String) {
        println("The $nameV stops.")
    }
    fun speedUp(nameV: String) {
        println("The $nameV speeds up!")
    }

    fun slowsDown(nameV: String) {
        println("The $nameV slows down.")
    }
    fun getNbWheels(nameV: String, nbW: Int) {
        println("The $nameV has $nbW wheels.")
    }
    fun getNoisePoll(nameV: String, noiseP: String) {
        println("The $nameV is $noiseP.")
    }
}

interface ElectricVehicle: Vehicle {
    fun recharging(nameV: String) {
        println("The $nameV is recharging.")
    }
}

interface FuelVehicle: Vehicle {
    fun refueling(nameV: String) {
        println("The $nameV is refueling.")
    }
}

interface HybridVehicle: FuelVehicle, ElectricVehicle

interface Car {
    fun turnOnRadio() {
        println("The radio is now turned on. Enjoy!")
    }
}

interface Moto {
    fun rearsUp(nameV: String) {
        println("The $nameV rears up!")
    }
}

interface BicycleInt: Vehicle, Moto {
    fun ringBell() {
        println("Ding Dong ♫⋆｡♪")
    }
}

