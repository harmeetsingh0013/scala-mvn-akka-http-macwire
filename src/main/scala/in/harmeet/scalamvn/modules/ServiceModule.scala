package in.harmeet.scalamvn.modules

import com.softwaremill.macwire.wire
import in.harmeet.scalamvn.service.UserService
import in.harmeet.scalamvn.service.impl.UserServiceImpl

trait ServiceModule extends RepositoryModule {

  lazy val userService: UserService = wire[UserServiceImpl]
}
