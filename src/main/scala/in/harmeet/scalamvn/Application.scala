package in.harmeet.scalamvn

import in.harmeet.scalamvn.modules.{ControllerModule, ServerModule}

object Application extends App with ServerModule with ControllerModule {

  println("Akka HTTP server going to start \n\n")

  server.bind(routes = routes)

  println("Akka HTTP Server is started and application deployed")
}
