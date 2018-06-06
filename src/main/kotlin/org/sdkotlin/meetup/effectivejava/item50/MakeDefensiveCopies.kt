package org.sdkotlin.meetup.effectivejava.item50

/* Effective Java
Item 50: Make defensive copies when needed
 */

// Kotlin data classes come with copy()

data class Person(val name: String, var age: Int)

object OlympicTriplets {
	val leila = Person("Leila", 33)
	val liina = leila.copy(name = "Liina")
	val lily = liina.copy(name = "Lily")

	override fun toString(): String {
		return "{ $leila, $liina, $lily }"
	}
}


fun main(args: Array<String>) {

	// Copy Leila so as not to change her age
	val leilaClone = OlympicTriplets.leila.copy()

	leilaClone.age++

	println(OlympicTriplets)

	// Otherwise...
	OlympicTriplets.leila.age++

	println(OlympicTriplets)
}
