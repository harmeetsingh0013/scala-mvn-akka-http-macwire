package in.harmeet.scalamvn.service.impl

import in.harmeet.scalamvn.models.User
import in.harmeet.scalamvn.repository.UserRepository
import in.harmeet.scalamvn.service.UserService

class UserServiceImpl(userRepository: UserRepository) extends UserService {

  override def findUsers: Vector[User] = userRepository.findAllUsers
}
