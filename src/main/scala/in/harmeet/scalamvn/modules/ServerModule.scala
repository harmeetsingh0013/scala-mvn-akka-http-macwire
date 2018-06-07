package in.harmeet.scalamvn.modules

import com.softwaremill.macwire.wire

trait ServerModule extends AkkaModule {

  lazy val server = wire[Server]
}
