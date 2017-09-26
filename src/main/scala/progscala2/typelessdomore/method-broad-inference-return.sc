def makeList(strings: String*) = {
  if(strings.length == 0)
    List.empty[String]
  else
    strings.toList
}

val list: List[String] = makeList()
