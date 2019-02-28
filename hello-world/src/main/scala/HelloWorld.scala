import akka.actor.ActorSystem

object HelloWorld extends App {

  var actorSystem = ActorSystem("eddy")

  println("hello akka")
  println(s"$actorSystem")

}
