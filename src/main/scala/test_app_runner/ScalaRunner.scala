package test_app_runner

import akka.actor._
import akka.util._

object ScalaRunner extends App  {

  /*def main(args: Array[String]): Unit = {
    println("Hi, John Smith")
  }*/

  val system = ActorSystem("actor-demo-scala")
  val hello = system.actorOf(Props[Hello])
  hello ! "Bob"
  //Thread sleep 1000
  //system shutdown

  class Hello extends Actor {
    def receive = {
      case name: String => println(s"Hello $name")
    }
  }
}
