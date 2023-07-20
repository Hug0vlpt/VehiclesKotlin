// CARS
class ElectricCar: ElectricVehicle, Car {
    override val nameV = "electric car"
    override val nbWheels = 4
    override val noisePoll = "quiet"
}

class FuelCar: FuelVehicle, Car {
    override val nameV = "fuel car"
    override val nbWheels = 4
    override val noisePoll = "moderately noisy"
}

class HybridCar: HybridVehicle, Car {
    override val nameV = "hybrid car"
    override val nbWheels = 4
    override val noisePoll = "pretty quiet"
}

// MOTORCYCLES
class ElecMotoC: ElectricVehicle, Moto {
    override val nameV = "electric motorcycle"
    override val nbWheels = 2
    override val noisePoll = "quiet"
}

class FuelMotoC: FuelVehicle, Moto {
    override val nameV = "fuel motorcycle"
    override val nbWheels = 2
    override val noisePoll = "loud"
}

// BICYCLE
class Bicycle: BicycleInt {
    override val nameV = "bicycle"
    override val nbWheels = 2
    override val noisePoll = "so quiet"
}
