import bicycle.Bicycle
import electric.ElecMotoC
import electric.ElectricCar
import electric.IElectricVehicle
import fuel.FuelCar
import fuel.FuelMotoC
import hybrid.HybridCar
import vehicle.Vehicle

fun main () {
    val eCar = ElectricCar()
    println("▼ ACTIONS")
    eCar.start()
    eCar.turnOnRadio()
    eCar.speedUp()
    eCar.slowDown()
    eCar.stop()
    println("▼ INFOS")
    var nbw: Int = eCar.getNbW()
    println("The ${eCar.name} has $nbw wheels.")
    var npl: Noise = eCar.getNP()
    println("The ${eCar.name} is $npl.")
    eCar.recharging()
    println()

    val fCar = FuelCar()
    println("▼ ACTIONS")
    fCar.start()
    fCar.turnOnRadio()
    fCar.speedUp()
    fCar.slowDown()
    fCar.stop()
    println("▼ INFOS")
    nbw = fCar.getNbW()
    println("The ${fCar.name} has $nbw wheels.")
    npl = fCar.getNP()
    println("The ${fCar.name} is $npl.")
    fCar.refueling()
    println()

    val hCar = HybridCar()
    println("▼ ACTIONS")
    hCar.start()
    hCar.turnOnRadio()
    hCar.speedUp()
    hCar.slowDown()
    hCar.stop()
    println("▼ INFOS")
    nbw = hCar.getNbW()
    println("The ${hCar.name} has $nbw wheels.")
    npl = hCar.getNP()
    println("The ${hCar.name} is $npl.")
    hCar.refueling()
    hCar.recharging()
    println()

    val eMoto = ElecMotoC()
    println("▼ ACTIONS")
    eMoto.start()
    eMoto.speedUp()
    eMoto.rearsUp()
    eMoto.slowDown()
    eMoto.stop()
    println("▼ INFOS")
    nbw = eMoto.getNbW()
    println("The ${eMoto.name} has $nbw wheels.")
    npl = eMoto.getNP()
    println("The ${eMoto.name} is $npl.")
    eMoto.recharging()
    println()

    val fMoto = FuelMotoC()
    println("▼ ACTIONS")
    fMoto.start()
    fMoto.speedUp()
    fMoto.rearsUp()
    fMoto.slowDown()
    fMoto.stop()
    println("▼ INFOS")
    nbw = fMoto.getNbW()
    println("The ${fMoto.name} has $nbw wheels.")
    npl = fMoto.getNP()
    println("The ${fMoto.name} is $npl.")
    fMoto.refueling()
    println()

    val bCy = Bicycle()
    println("▼ ACTIONS")
    bCy.start()
    bCy.speedUp()
    bCy.rearsUp()
    bCy.ringBell()
    bCy.slowDown()
    bCy.stop()
    println("▼ INFOS")
    nbw = bCy.getNbW()
    println("The ${bCy.name} has $nbw wheels.")
    npl = bCy.getNP()
    println("The ${bCy.name} is $npl.")

    println()
    val test: IElectricVehicle = HybridCar()
    test.recharging()

    println()
    val test2: List<Vehicle> = listOf(ElectricCar(), FuelCar(), Bicycle(), HybridCar())
    for (vehicle in test2) {
        vehicle.start()
        if (vehicle is IElectricVehicle) {
            vehicle.stop()
            vehicle.recharging()
        }
    }
}