package in.harmeet.scalamvn.modules

import com.softwaremill.macwire.wire
import in.harmeet.scalamvn.repository.UserRepository
import in.harmeet.scalamvn.repository.impl.UserRepositoryImpl

trait RepositoryModule {

  lazy val userRepository: UserRepository = wire[UserRepositoryImpl]
}
