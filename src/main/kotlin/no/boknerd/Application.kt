package no.boknerd

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("no.boknerd")
		.start()
}

