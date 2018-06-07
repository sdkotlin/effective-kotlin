package org.sdkotlin.meetup.effectivejava.item62

/* Effective Java
Item 62: Avoid strings where other types are more appropriate
 */

// Data classes in Kotlin are so easy!

data class EmailAddress(val address: String)

fun send(emailAddress: String) {
	println("Sending to $emailAddress")
}

// vs.

fun send(emailAddress: EmailAddress){
	println("Sending to ${emailAddress.address}")
}

// Easy to add a "name" property in the future!
