package org.sdkotlin.meetup.effectivejava.item16

/* Effective Java
Item 16: In public classes, use accessor methods, not public fields
 */

// Kotlin doesn't have fields, only properties with their associated accessors
// and private backing fields

data class Programmer(val name: String) {
	var languages = "Kotlin"
		set(value) {
			if (value == "Kotlin") field += ", and $value"
		}
}

fun main(args: Array<String>) {

	val programmer = Programmer("Jim")

	programmer.languages = "Java"
	programmer.languages = "Kotlin"

	println("${programmer.name} knows ${programmer.languages}.")
}
