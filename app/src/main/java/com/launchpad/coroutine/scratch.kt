package com.launchpad.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.concurrent.atomic.AtomicLong
import kotlin.concurrent.thread

fun main(){

  println("Start")

  val c = AtomicLong()
  for (i in 1..1_000_000L)
    GlobalScope.launch {
      c.addAndGet(i)
    }
  println(c.get())
  println("Stop")
}


/*

// Using threads - takes about 4 minutes
println("Start")

val c = AtomicLong()

for (i in 1..1_000_000L)
thread(start = true) {
c.addAndGet(i)
println("i:$i")
}

println(c.get())
println("Stop")

 */

/*
// using coroutines, takes about
  val c = AtomicLong()
  for (i in 1..1_000_000L)
    GlobalScope.launch {
      c.addAndGet(i)
     }
  println(c.get())
 */