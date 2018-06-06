package org.sdkotlin.meetup.effectivejava.item3and4

/* Effective Java
Item 3: Enforce the singleton property with a private constructor or an enum type
Item 4: Enforce noninstantiability with a private constructor
 */

// Kotlin has the singleton pattern built into the language using `object`
// definitions

object HelloSingleton {

	private const val mood = "great"

	fun howYouDoin() {
		println("${mood.capitalize()}, thanks for asking!")
	}
}

fun main(args: Array<String>) {

	HelloSingleton.howYouDoin()
}
