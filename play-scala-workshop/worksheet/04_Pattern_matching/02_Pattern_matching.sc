/**
 * If you’re familiar with type erasure on the Java platform,
 * you may know that this won’t work.
 * @param l
 * @return
 */
def echoWhatIsTypeYouGaveMeTheList(l: Any): String = l match {
  case l: List[Int] => s"List of Int $l"
  case l: List[String] => s"List of String $l"
}

echoWhatIsTypeYouGaveMeTheList(List(1,2,3))
echoWhatIsTypeYouGaveMeTheList(List("1","2","3"))
echoWhatIsTypeYouGaveMeTheList(List("Too","Much","3"))