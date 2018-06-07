package in.harmeet.scalamvn.repository

import in.harmeet.scalamvn.models.User

trait UserRepository {

  def findAllUsers: Vector[User]
}
