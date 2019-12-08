import scala.language.implicitConversions

object Story {
  object Once { def upon = (x: a.type) => x }
  object a { def time = (x: languages.type) => x }
  object languages { def were = (x: inflexible.type) => x }
  object inflexible { def along = (x: came.type) => x }
  object came { def Scala = (x: inflexible.type) => x }
  implicit def string(s : String) : inflexible.type = inflexible

  def told(): Unit = {
    Once upon a time languages were inflexible; "Then " along came Scala ". The End!"
  }
}