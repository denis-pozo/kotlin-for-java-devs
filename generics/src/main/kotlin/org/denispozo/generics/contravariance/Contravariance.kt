package org.denispozo.generics.contravariance

import java.util.concurrent.Flow

fun main(args: Array<String>) {

    val flowerTender = object: FlowerCare<Flower> {
        override fun prune(flower: Flower) = println("I'm tending a ${flower.name}!")
    }

//    val roseTender = object: FlowerCare<Rose> {
//        override fun prune(flower: Rose) = println("I'm pruning a rose!")
//    }

    val roseGarden = Garden<Rose>(listOf(Rose(), Rose()), flowerTender)
    roseGarden.tendFlower(0)

//    val daffodilTender = object : FlowerCare<Daffodil> {
//        override fun prune(flower: Daffodil) = println("I'm prunning a daffodil!")
//    }

    val daffodilGarden = Garden<Daffodil>(listOf(Daffodil(), Daffodil(), Daffodil()), flowerTender)
    daffodilGarden.tendFlower(2)
}

class Garden<T: Flower>(val flowers: List<T>, val flowerCare: FlowerCare<T>) {
    fun pickFlower(i: Int) = flowers[i]
    fun tendFlower(i: Int) = flowerCare.prune(flowers[i])
}

open class Flower (val name: String) {}

class Rose: Flower("Rose") {}
class Daffodil: Flower("Daffodil") {}

// We declare the interface as contravariant:
// Consequence: We can't use the parameter T as output parameter, only as input
// It ensures usage of classes and their super classes
interface FlowerCare<in T> {
    fun prune(flower: T)
}
