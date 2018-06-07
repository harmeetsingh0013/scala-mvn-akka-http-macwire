package in.harmeet.scalamvn.repository.impl

import in.harmeet.scalamvn.models.User
import in.harmeet.scalamvn.repository.UserRepository

class UserRepositoryImpl extends UserRepository{
  override def findAllUsers: Vector[User] =
    Vector(User(13, "James", 29))
}
