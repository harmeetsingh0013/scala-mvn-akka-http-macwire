package in.harmeet.scalamvn.service

import in.harmeet.scalamvn.models.User

trait UserService {

  def findUsers: Vector[User]
}
