package in.harmeet.scalamvn.modules

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.{Directives, Route}
import com.softwaremill.macwire.wire
import in.harmeet.scalamvn.controllers.{BaseRoute, UserRoute}

trait ControllerModule extends ServiceModule {

  val seq: Seq[BaseRoute] = Seq (
    wire[UserRoute]
  )

  val routes: Route = seq.foldLeft[Route](Directives.reject) {
    case (acc, route) => acc ~ route.route
  }
}
