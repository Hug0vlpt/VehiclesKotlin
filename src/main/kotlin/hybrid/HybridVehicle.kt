package hybrid

import vehicle.Vehicle

abstract class HybridVehicle: Vehicle(), IHybridVehicle {
    override fun recharging() {
        println("The $name is recharging.")
    }
    override fun refueling() {
        println("The $name is refueling.")
    }
}
