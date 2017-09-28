package milestoneProject

object SearchEngine {
  //Create a user
  class User(name: String, pass: String, history: List[Search]) {
    val userName = name
    private val password = pass
    val searchHistory = history

    override def toString: String = {
      return s"$userName's Search History\n$searchHistory}"
    }
  }

  case class Search(search: String, results: List[Result])
  case class Result(result: String, description: String)

  def main(args: Array[String]) {
    //Make some searches
    val GameSearch = Search("League of Legends", List(
      Result("Top 5 plays", "The best plays of League of Legends"),
      Result("Top 5 Champions", "The best champions of League of Legends"),
      Result("Builds", "Champion build guides for League of Legends")
    ))

    val VideoSearch = Search("Funny", List(
      Result("Top 5 funniest moments", "The funniest moments"),
      Result("Top 5 funniest things", "The funniest things"),
      Result("Funny Comedians", "Comedians whom are funny")
    ))

    val ShoppingSearch = Search("Computer", List(
      Result("Top 5 best computers", "The best computers"),
      Result("Top 5 most bought computers", "The most bought computers"),
      Result("How-to-build computers", "Build guides for computers")
    ))

    val RandomSearch = Search("Randomness", List(
      Result("Top 5 most random things", "The most random things"),
      Result("Top 5 most random incidents", "The most random incidents")
    ))


    val FinalSearch = Search("Finals", List(
      Result("Top 5 final questions", "The most occurying final questions"),
      Result("Top 5 hardest finals", "The hardest taken finals"),
      Result("How-to-pass a final", "Passing guides for finals")
    ))

    //make users
    val Alisha = new User("Alisha", "StrongPassWord", List(GameSearch, VideoSearch))
    val Kate = new User("BestFriend", "SecretPass", List(GameSearch, ShoppingSearch, FinalSearch))
    val Marcus = new User("Marcus", "TypicalPass", List())
    val Sarah = new User("Beth", "MoreSecret", List(RandomSearch))
    val Abby = new User("Friend", "HelloWorld1", List(RandomSearch, GameSearch))

    val searchEngineUsers = List(Alisha, Kate, Marcus, Sarah, Abby)

    // Print
    for (user <- searchEngineUsers) println(user)

  }
}
